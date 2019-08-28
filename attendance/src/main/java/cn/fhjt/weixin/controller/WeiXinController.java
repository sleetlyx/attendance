package cn.fhjt.weixin.controller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


import cn.fhjt.weixin.mapper.SavePublicTokenMapper;
import cn.fhjt.weixin.pojo.SavePublicToken;
import cn.fhjt.weixin.pojo.TbBindingWechat;
import cn.fhjt.weixin.pojo.TbCheckInRecord;
import cn.fhjt.weixin.pojo.TbNew;
import cn.fhjt.weixin.pojo.entity.PageResult;
import cn.fhjt.weixin.service.CheckInRecordService;
import cn.fhjt.weixin.service.TbBindingWechatService;
import cn.fhjt.weixin.service.TbNewService;
import cn.fhjt.weixin.service.imp.PublicFansServiceImpl;
import cn.fhjt.weixin.service.imp.TbNewPicServiceImpl;
import cn.fhjt.weixin.utils.CustomerContextHolder;
import cn.fhjt.weixin.utils.HttpsClientUtil;
import cn.fhjt.weixin.utils.LocalSysUtil;
import cn.fhjt.weixin.utils.WXAppletUserInfo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/weixin")
public class WeiXinController {

    private final static Logger logger = Logger.getLogger(WeiXinController.class);
    //开发者APPID
    @Value("${APPID}")
    private String appId;
    //小程序开发者密匙APP_SECRET
    @Value("${APP_SECRET}")
    private String appSecret;
    //图片保存路径
    @Value("${URL}")
    private String url;
    @Value("${PUBLICNUMBER_GET_TOKEN_URL}")
    private String PUBLICNUMBER_GET_TOKEN_URL;
    @Value("${PUBLICNUMBER_GET_NUIONID_URL}")
    private String PUBLICNUMBER_GET_NUIONID_URL;
    //从小程序获取的随机字符串  放弃使用全局变量  eg:单列模式  多线程不安全
//	public String wxCode;
    //存储openId 和密匙
//	private  String openid = null;
//	private  String secret = null;
    @Autowired
    private SavePublicTokenMapper savePublicTokenMapper;

    @Autowired
    private TbBindingWechatService tbBindingWechatService;

    @Autowired
    private CheckInRecordService checkInRecordService;

    @Autowired
    private TbNewService tbNewService;

    @Autowired
    private PublicFansServiceImpl publicFansService;



    /**
     * 授权页面发起的请求
     * 第一次 进入小程序时  通过openID校验是否保定过  从而进入不同的小程序页面
     *
     * @param code 每次访问小程序 传递的随机字符串 用于获得openID和会话密匙 授权
     * @return
     */
    @RequestMapping("/code")
    public Map<String, Object> isbind(String code) {
        Map<String, Object> resmap = new HashMap();
//		wxCode = code;
        //获取当前微信用户的唯一标识
        JSONObject json = getUserInfo(code);
        String openid = json.getString("openid");
        String secret = json.getString("session_key");
        //通过唯一表示  判断是否存在数据
        TbBindingWechat bidwechat = tbBindingWechatService.findByOpenid(openid);
        resmap.put("openid", openid);
        resmap.put("sessionKey", secret);

        if (bidwechat == null) {
            //code 响应状态码
            resmap.put("code", 0);//没过绑定
            resmap.put("openid", openid);
            resmap.put("sessionkey", secret);

        } else {
            //有数据 需要更新 sessionkey
            bidwechat.setSessionKey(secret);
            tbBindingWechatService.update(bidwechat);

            resmap.put("bindcode", bidwechat.getCode());
            resmap.put("empid", bidwechat.getUserId());
            resmap.put("dept", bidwechat.getDepartment());
            resmap.put("name", bidwechat.getUserName());
            resmap.put("sessionkey", secret);
            resmap.put("code", 1);//已经绑定过
        }
        return resmap;
    }

    /**
     * 进入首页后 校验 该用户是否在职且存在 唯一标识
     *
     * @param bindcode
     * @return
     */
    @RequestMapping("/findBybindcodeToOpenId")
    public Map<String, Object> findBybindcodeToOpenId(String bindcode, String resCode, String openid) {
        TbBindingWechat tbBindingWechat;
        Map<String, Object> map = new HashMap<>();

        if (bindcode == null || "".equals(bindcode)) {
            if (openid != null && !"".equals(openid)) {
                tbBindingWechat = tbBindingWechatService.findByOpenid(openid);
            } else {
                JSONObject json = getUserInfo(resCode);
                openid = json.getString("openid");
                String secret = json.getString("session_key");

                tbBindingWechat = tbBindingWechatService.findByOpenid(openid);

                if (tbBindingWechat != null) {
                    //有数据 需要更新 sessionkey
                    tbBindingWechat.setSessionKey(secret);
                    tbBindingWechatService.update(tbBindingWechat);
                }
            }
        } else {
            tbBindingWechat = tbBindingWechatService.findBybidcodetToOpenId(bindcode);
        }
        String code = "0";//0为进入绑定页面
        if (tbBindingWechat != null) {
            if ((tbBindingWechat.getOpenId() != null && !"".equals(tbBindingWechat.getOpenId())) && tbBindingWechat.getState().equals("在职")) {
                code = "1";
                map.put("dept", tbBindingWechat.getDepartment());
                map.put("name", tbBindingWechat.getUserName());
                map.put("openid", tbBindingWechat.getOpenId());
                map.put("empid", tbBindingWechat.getUserId());
                map.put("sessionkey", tbBindingWechat.getSessionKey());
            }
        }

        map.put("code", code);
        return map;
    }

    /**
     * 通过绑定码 回显实体数据
     *
     * @param code
     * @return
     */
    @RequestMapping("/finOneByCode")
    public @ResponseBody
    Map<String, Object> finOneByCode(String code) {

        if (code != null) {
            TbBindingWechat tbBindingWechat = tbBindingWechatService.finOneByCode(code);
            Map<String, Object> map = new HashMap<>();
            if (tbBindingWechat != null) {
                map.put("status", "0");//在当前页进行绑定业务
                map.put("data", tbBindingWechat);
                return map;
            } else {
                return null;
            }
        }

        return null;
    }

    /**
     * 通过工号和 绑定 进行工号和绑定码的唯一性绑定
     *
     * @param code   微信获得openid
     * @param userId 工号
     * @param openid
     * @return
     */
    @RequestMapping("/bindUser")
    public @ResponseBody
    Map<String, Object> bindUser(String code, String userId, String openid, String sessionkey) {

        Long id = new Long(userId);
        TbBindingWechat entity = tbBindingWechatService.findOne(id);

        if (openid == null || "".equals(openid)) {
//			wxCode = code;
            JSONObject json = getUserInfo(code);
            String inopenId = json.getString("openid");
            sessionkey = json.getString("session_key");

            if (inopenId == null) {
                entity.setOpenId(entity.getSpare1());
            } else {
                entity.setOpenId(inopenId);
            }
            entity.setSessionKey(sessionkey);
            entity.setSpare1(inopenId);
        } else {
            entity.setOpenId(openid);
            entity.setSessionKey(sessionkey);
            entity.setSpare1(openid);
        }
        //修改该绑定数据的code有效性 1 为无效；已经被绑定过；
        entity.setStatus("1");

        Map<String, Object> map = new HashMap<>();
        try {
            tbBindingWechatService.update(entity);
            map.put("bindcode", entity.getCode());
            map.put("empid", entity.getUserId());
            map.put("dept", entity.getDepartment());
            map.put("name", entity.getUserName());
            map.put("sessionkey", entity.getSessionKey());
            map.put("status", "0");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("status", "1");
        }
        return map;
    }

    /**
     * 上传图片
     *
     * @param uploadfile_ant
     * @param request
     * @return
     */
    @RequestMapping("/uplodfile")
    public String uplodfile(MultipartFile uploadfile_ant, HttpServletRequest request) {
        File targetFile = null;
        logger.info("========处理小程序上传图片开始=========");
        try {
            // 获得文件名:
            String fileName = uploadfile_ant.getOriginalFilename();
            // 获得文件的扩展名:
            String extName = fileName.substring(fileName.lastIndexOf(".") + 1);
            //文件夹名称  按月份命名
            SimpleDateFormat flodFormat = new SimpleDateFormat("YYYYMM");
            String flod = flodFormat.format(new Date());//文件夹
            //文件名称 按时间+字符串命名
            String randid = UUID.randomUUID().toString();
            randid = randid.replaceAll("-", "");

            SimpleDateFormat filenameOriginal = new SimpleDateFormat("YYYYMMddHHmmss");
            //外加六个随机数  防止同一时间文件名上传出现重复
            int i = new Random().nextInt(20);
            String newFileName = filenameOriginal.format(new Date()) + randid.substring(i, i + 6) + "." + extName;

            //获得存储的绝对路径
            String upload = request.getSession().getServletContext().getRealPath("upload");

            File file1 = new File(upload + "/" + flod);
            //如果文件夹不存在则创建
            if (!file1.exists() && !file1.isDirectory()) {
                file1.mkdir();
            }

            //将图片存入问价夹
            targetFile = new File(file1, newFileName);
            uploadfile_ant.transferTo(targetFile);

            logger.info("========处理小程序上传图片结束=========");
            String resUrel = url + "/" + flod + "/" + newFileName;
            return resUrel;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("========处理小程序上传图片异常=========", e);

            return null;
        }
    }

    /**
     * 签到
     *
     * @param checkInRecord
     * @return
     */
    @RequestMapping("/signinother")
    public Map<String, Object> signinother(@RequestBody TbCheckInRecord checkInRecord) {
        Map<String, Object> map = new HashMap<>();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(simpleDateFormat.format(new Date()));
            checkInRecord.setCheckTime(date);

            checkInRecord.setPicUrl(checkInRecord.getPicUrl().replaceAll("\"", ""));

            //查询当时的打卡次数进行修改打卡次数
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            String cerStartStr = simpleDateFormat1.format(new Date()) + " 00:00:00";
            String cerEndStr = simpleDateFormat1.format(new Date()) + " 23:59:59";
            Date stdate = simpleDateFormat.parse(cerStartStr);
            Date endate = simpleDateFormat.parse(cerEndStr);

            TbCheckInRecord tbCheckInRecord = checkInRecordService.findByEmpIdDate(checkInRecord.getEmpId(), stdate, endate);
            if (tbCheckInRecord != null) {
                //获得当前日 最近一次打卡是的次数记录  加1 个当前的打卡数据
                Integer checkNum = new Integer(tbCheckInRecord.getSpare0());
                checkInRecord.setSpare0((checkNum + 1) + "");
                map.put("checkNum", checkNum + 1);
            } else {
                checkInRecord.setSpare0(1 + "");
                map.put("checkNum", 1);
            }
            checkInRecordService.add(checkInRecord);
            map.put("status", 0);

            return map;
        } catch (Exception e) {
            map.put("status", 1);
            return map;
        }
    }

    /**
     * 由首页获取 轮播图、公告、新闻、
     *
     * @return
     */
    @RequestMapping("/news")
    public Map<String, Object> findnews() {
//		String newType = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");

        List<TbNew> banderList = tbNewService.findByType("轮播图");

        List<TbNew> boadrList = tbNewService.findByType("公告");

        List<TbNew> newList = tbNewService.findByType("新闻");

        for (TbNew obj : newList) {
            try {
                String format = simpleDateFormat.format(obj.getNewTime());
                obj.setNewTime(simpleDateFormat.parse(simpleDateFormat.format(obj.getNewTime())));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        Map<String, Object> map = new HashMap<>();

        map.put("banners", banderList);
        map.put("noticeList", boadrList);
        map.put("news", newList);
        return map;
    }

    /**
     * 通过新闻id 查询新闻的具体类容
     *
     * @param id
     * @return
     */
    @RequestMapping("/findByid")
    public TbNew findByid(Long id) {
        TbNew one = tbNewService.findOne(id);
        return one;
    }

    /**
     * 查询打卡记录 按天 分组显示
     *
     * @param empid
     * @return
     */
    @RequestMapping("/getNotesByEmpid")
    public List<Map<String, Object>> getNotesByEmpid(String empid, String time) {

        //用于存放最后的封装数据
        List<Map<String, Object>> listmain = new ArrayList<>();

        TbCheckInRecord checkInRecord = new TbCheckInRecord();
        checkInRecord.setEmpId(empid);
        Date startTime = null;
        Date endTime = null;
        PageResult page = null;
        if (time != null && !"".equals(time)) {
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                String sttime = time + " 00:00:01";
                String entime = time + " 23:59:59";
                startTime = simpleDateFormat0.parse(sttime);
                endTime = simpleDateFormat0.parse(entime);
//				String tte = simpleDateFormat.format(startTime);
                page = checkInRecordService.findPage(checkInRecord, 1, 50, startTime, endTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            page = checkInRecordService.findPage(checkInRecord, 1, 12);
        }
        List<TbCheckInRecord> rows = null;
        if (page != null) {
            rows = page.getRows();
        }
        //根据日期封装打卡的数据
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm:ss");
        String eqcurrentDate = null;
        List<Map<String, Object>> listchild = null;// 存放子数据
        if (rows != null && rows.size() > 0) {
            for (int i = 0; i < rows.size(); i++) {
                TbCheckInRecord tbCheckInRecord = rows.get(i);
                String currentDate = simpleDateFormat.format(tbCheckInRecord.getCheckTime());//取出日期的年月日
                String currentTime = simpleDateFormat1.format(tbCheckInRecord.getCheckTime());///取出日期的时分秒

                if (eqcurrentDate != null && eqcurrentDate.equals(currentDate)) {//如果是同一天数据 封装到 listchild
                    if (listchild == null) {
                        listchild = new ArrayList<>();
                    }
                    Map<String, Object> mapchild = new HashMap<>();//封装子数据
                    mapchild.put("empid", tbCheckInRecord.getEmpId());
                    mapchild.put("name", tbCheckInRecord.getName());
                    mapchild.put("localname", tbCheckInRecord.getLocalName());
                    mapchild.put("currentTime", currentTime);
                    mapchild.put("id", i * 10);
                    listchild.add(mapchild);

                    if (i == rows.size() - 1) {// 当循环到最后一条数据时 该日期下的数据此时需要通过该逻辑 将数据 封装进  listmain  之后结束循环
                        Map<String, Object> map = new HashMap<>();
                        map.put("listchild", listchild);
                        listchild = null;//进行最后的数据封装后 将子list清空  用到是重新实例化
                        map.put("eqcurrentDate", eqcurrentDate);
                        map.put("id", i);
                        listmain.add(map);
                    }
                } else {
                    if (i != 0) {//第一次进入时不进行最后的数据封装  在新的日期出现时江上一个日期数据封装
                        Map<String, Object> map = new HashMap<>();
                        map.put("listchild", listchild);
                        listchild = null;
                        map.put("eqcurrentDate", eqcurrentDate);
                        map.put("id", i);
                        listmain.add(map);
                    } else if (i == 0 && rows.size() == 1) {//如果只有一条数据  则进入保存最后的封装  (只有一条数据的处理逻辑)
                        Map<String, Object> mapchild = new HashMap<>();
                        mapchild.put("id", i * 10);
                        mapchild.put("empid", tbCheckInRecord.getEmpId());
                        mapchild.put("name", tbCheckInRecord.getName());
                        mapchild.put("localname", tbCheckInRecord.getLocalName());
                        mapchild.put("currentTime", currentTime);
                        listchild = new ArrayList<>();
                        listchild.add(mapchild);

                        Map<String, Object> map = new HashMap<>();
                        map.put("listchild", listchild);
                        listchild = null;
                        map.put("eqcurrentDate", currentDate);
                        map.put("id", i);
                        listmain.add(map);
                        return listmain;//直接将该数据返回
                    }
                    if (listchild == null) {
                        listchild = new ArrayList<>();
                    }
                    Map<String, Object> mapchild = new HashMap<>();
                    mapchild.put("id", i * 10);
                    mapchild.put("empid", tbCheckInRecord.getEmpId());
                    mapchild.put("name", tbCheckInRecord.getName());
                    mapchild.put("localname", tbCheckInRecord.getLocalName());
                    mapchild.put("currentTime", currentTime);
                    listchild.add(mapchild);//将数据封装到子数据列表中
                }

                eqcurrentDate = currentDate;//用于比较日期
            }
        }
        return listmain;
    }

    /**
     * 解密用户的 敏感数据
     *
     * @param encryptedData 加密数据
     * @param iv            偏移量
     * @return
     */
    @RequestMapping("/getUnionid")
    public Map<String, Object> getUnionid(String encryptedData, String iv, String sessionkey) {

        Map<String, Object> map = new HashMap<>();
        JSONObject userInfo = WXAppletUserInfo.getUserInfo(encryptedData, sessionkey, iv);
        map.put("data", userInfo);
        return map;
    }

    /**
     * 因为 微信公众号的token 获取次数有限  需要进行持久化处理
     *
     * @return
     */
    @RequestMapping("/getPublicNumberUidByToken")
    public List<JSONObject> getPublicNumberUidByToken() {
        JSONObject jsonObjectAll = null;//存储一百个用户的信息
        List<JSONObject> jsonObjectAllList = new ArrayList<>();//存储所有用户的信息
//		String access_token= null;//新获得的有效token
        String token = null;//持久层的token
        JSONObject publicNumberOr = null;// 粉丝携带openID的数据
        Boolean checkToken = false;//判断数据库是否存在token
        SavePublicToken publicNumberToken = getPublicNumberToken();
        if (publicNumberToken != null) {
            token = publicNumberToken.getPublicToken();
            checkToken = true;
        }
        if (checkToken) {//使用持久层所 获得的token
            //获得 所有关注过公众号的 用户的openID信息 一次只拉1000个数据
            String s = HttpsClientUtil.getInstance().get(PUBLICNUMBER_GET_NUIONID_URL + token);
            publicNumberOr = JSONObject.parseObject(s);
            if (publicNumberOr == null) {//防止  请求偶尔失败的情况
                String ss = HttpsClientUtil.getInstance().get(PUBLICNUMBER_GET_NUIONID_URL + token);
                publicNumberOr = JSONObject.parseObject(ss);
            }

            if (publicNumberOr != null && publicNumberOr.get("errcode") != null) {//持久token失效 后的处理
                token = getPublicNumberNewToken(publicNumberToken);
                //获得 所有关注过公众号的 用户的openID信息
                String s1 = HttpsClientUtil.getInstance().get(PUBLICNUMBER_GET_NUIONID_URL + token);
                publicNumberOr = JSONObject.parseObject(s1);
            }
        } else {//数据库不存在 token值时
            token = getPublicNumberNewToken(publicNumberToken);
            //获得 所有关注过公众号的 用户的openID信息
            String s1 = HttpsClientUtil.getInstance().get(PUBLICNUMBER_GET_NUIONID_URL + token);
            publicNumberOr = JSONObject.parseObject(s1);
        }

        if (publicNumberOr != null && publicNumberOr.get("errcode") == null) {//处理返回公众号openid的集合
            Map<String, Object> mapData = (Map<String, Object>) publicNumberOr.get("data");
            List<Object> listOpenid = (List<Object>) mapData.get("openid");

            List<Map<String, String>> postlist = new ArrayList<>();//封装拉取基本信息的 post 请求参数

            //当大于1000个粉丝时 递归处理 返回所有粉丝携带openID的 结果集
            int k = LocalSysUtil.mathCeil(publicNumberOr.get("total") + "", publicNumberOr.get("count") + "");
            ArrayList<JSONObject> jsonObjects = reFunction(publicNumberOr, token, null,k);

            if (jsonObjects.size() > 1) {
                for (int i = 0; i < jsonObjects.size(); i++) {
                    JSONObject jsonObject = jsonObjects.get(i);
                    Map<String, Object> mapDatain = (Map<String, Object>) jsonObject.get("data");
                    ArrayList<String> listOpenidin = (ArrayList<String>) mapDatain.get("openid");
                    //处理  小于等于1000个 粉丝时 star
                    for (String pubOpnid : listOpenidin) { //封装拉取基本信息的 post 请求参数//该post 请求一次只能拉取一百个用户的基本信息
                        Map<String, String> postMap = new HashMap<>();
                        postMap.put("openid", pubOpnid);
                        postMap.put("lang", "zh_CN");
                        postlist.add(postMap);
                    }
                }
            } else {
                //该post 请求一次只能拉取一百个用户的基本信息
                //处理  小于等于1000个 粉丝时 star
                for (Object pubOpnid : listOpenid) {
                    Map<String, String> postMap = new HashMap<>();
                    postMap.put("openid", pubOpnid.toString());
                    postMap.put("lang", "zh_CN");
                    postlist.add(postMap);
                }
                //处理  小于等于1000个 粉丝时 end
            }
            //post的参数  一次能只能传递一百个  此处需要循环封装抓取用户的基本信息
            Map<String, Object> parMap = new HashMap<>();
            Integer fork = LocalSysUtil.mathCeil(postlist.size() + "", 100 + "");
            int p = 0;
            for (int i = 0; i < fork; i++) {
                List<Map<String, String>> listI = new ArrayList<>();
                int m = 0;
                for (int j = p; j < postlist.size(); j++) {
                    listI.add(postlist.get(j));
                    p++;
                    m++;
                    if (m == 100) {
                        break;
                    }
                }
                parMap.put("user_list", listI);
                String s = JSONObject.toJSONString(parMap);
                String s1 = HttpsClientUtil.getInstance().postJson("https://api.weixin.qq.com/cgi-bin/user/info/batchget?access_token=" + token, s);
                jsonObjectAll = JSONObject.parseObject(s1);
                jsonObjectAllList.add(jsonObjectAll);
            }
        }
        //持久化 公众号 粉丝用户的基本信息
        publicFansService.save(jsonObjectAllList);
        return jsonObjectAllList;
    }

    /**
     * 从持久层获取token
     *
     * @return
     */
    public SavePublicToken getPublicNumberToken() {
        SavePublicToken savePublicToken = savePublicTokenMapper.getToken();
        if (savePublicToken != null) {
            return savePublicToken;
        }
        return null;
    }

    //持久层token失效时  获取新的token
    public String getPublicNumberNewToken(SavePublicToken publicNumberToken) {
        String objToken = HttpsClientUtil.getInstance().get(PUBLICNUMBER_GET_TOKEN_URL);
        JSONObject jsonObject = JSONObject.parseObject(objToken);
        String access_token = (String) jsonObject.get("access_token");
        //将新的token 持久化
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
        if (publicNumberToken == null) {
            publicNumberToken = new SavePublicToken();
            publicNumberToken.setPublicToken(access_token);
            savePublicTokenMapper.insert(publicNumberToken);
        } else {
            publicNumberToken.setPublicToken(access_token);
            savePublicTokenMapper.updateByPrimaryKeySelective(publicNumberToken);
        }
        return access_token;
    }

    //递归  处理 粉丝数据 openID
    public ArrayList<JSONObject> reFunction(JSONObject publicNumberOr, String token, ArrayList<JSONObject> lisJosn,Integer k ) {
        if (lisJosn == null) {
            lisJosn = new ArrayList<>();
        }

           if (Integer.parseInt(publicNumberOr.get("total") + "") > 1000 //总记录数
                   && Integer.parseInt(publicNumberOr.get("count") + "") <= 1000 //此次抓取的记录
                ){//一次只能拉取1000个openID
               lisJosn.add(publicNumberOr);
//               for (int i = 2; i <= k; i++) {
               if(k>0){
                   //TODO  需要修改地址 加上最后一个 openID 参数
                   String preLastOpenid = (String) publicNumberOr.get("next_openid");
                   String s1 = HttpsClientUtil.getInstance().get(PUBLICNUMBER_GET_NUIONID_URL + token + "&next_openid=" + preLastOpenid);
                   JSONObject publicNumberOr1 = JSONObject.parseObject(s1);
//                   lisJosn.add(publicNumberOr1);
//                   cont++;
                   k--;
                   reFunction(publicNumberOr1, token, lisJosn,k);//递归该函数  处理所有的粉丝数据
               }

           } else {
               lisJosn.add(publicNumberOr);
           }



        return lisJosn;
    }


    //在APP.js 发起的请求
    @RequestMapping("/getOpenid")
    public Map<String, Object> getOpenid(String code) {
        String openid = null;
        JSONObject json = getUserInfo(code);
        openid = json.getString("openid");
        String sessionkey = json.getString("session_key");
        if (openid != null) {
            TbBindingWechat byOpenid = tbBindingWechatService.findByOpenid(openid);
            if (byOpenid != null) {
                byOpenid.setSessionKey(sessionkey);
                tbBindingWechatService.update(byOpenid);
            }
        }
        Map<String, Object> map = new HashMap<>();
        map.put("openid", openid);
        map.put("sessionkey", sessionkey);
        return map;
    }

    /**
     * 获取openID和会话密匙
     *
     * @return
     */
    public JSONObject getUserInfo(String code) {
        // 获取session_key和openid
        JSONObject json = WXAppletUserInfo.getSessionKeyAndOropenid(code, appId, appSecret);
        return json;
    }

}
