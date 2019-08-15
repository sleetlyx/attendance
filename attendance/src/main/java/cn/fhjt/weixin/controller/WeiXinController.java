package cn.fhjt.weixin.controller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


import cn.fhjt.weixin.pojo.TbBindingWechat;
import cn.fhjt.weixin.pojo.TbCheckInRecord;
import cn.fhjt.weixin.pojo.TbNew;
import cn.fhjt.weixin.pojo.entity.PageResult;
import cn.fhjt.weixin.service.CheckInRecordService;
import cn.fhjt.weixin.service.TbBindingWechatService;
import cn.fhjt.weixin.service.TbNewService;
import cn.fhjt.weixin.utils.WXAppletUserInfo;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/weixin")
public class WeiXinController {

	private  final  static Logger logger = Logger.getLogger(WeiXinController.class);


	//开发者APPID3
//	@Value("wx515bafb9c3955329")
	@Value("${APPID}")
	private String appId;
	//小程序开发者密匙APP_SECRET
//	@Value("bd343ce1063ce5aef206ddc21c69d523")
	@Value("${APP_SECRET}")
	private  String appSecret;

	//图片保存路径
	@Value("${URL}")
	private  String url;
	//从小程序获取的随机字符串  放弃使用全局变量  eg:单列模式  多线程不安全
//	public String wxCode;
	//存储openId 和密匙
//	private  String openid = null;
//	private  String secret = null;

	@Autowired
	private TbBindingWechatService tbBindingWechatService;

	@Autowired
	private CheckInRecordService checkInRecordService;

	@Autowired
	private TbNewService tbNewService;

	
	/**
	 * 第一次 进入小程序时  通过openID校验是否保定过  从而进入不同的小程序页面
	 *
	 * @param code 每次访问小程序 传递的随机字符串 用于获得openID和会话密匙 授权
	 * @return
	 */
	@RequestMapping("/code")
	public
	Map<String,Object> isbind(String code){
		Map<String, Object> resmap = new HashMap();
//		wxCode = code;
		//获取当前微信用户的唯一标识
		JSONObject json = getUserInfo(code);
		String openid = json.getString("openid");
		String secret = json.getString("session_key");
		//通过唯一表示  判断是否存在数据
		 TbBindingWechat bidwechat = tbBindingWechatService.findByOpenid(openid);
        resmap.put("openid",openid);
        resmap.put("sessionKey",secret);

		 if(bidwechat == null){
		 	//code 响应状态码
			 resmap.put("code", 0);//没过绑定
			 resmap.put("openid", openid);
		 }
		 else {
             resmap.put("bindcode",bidwechat.getCode());
             resmap.put("empid",bidwechat.getUserId());
             resmap.put("dept",bidwechat.getDepartment());
             resmap.put("name",bidwechat.getUserName());
			 resmap.put("code", 1);//已经绑定过
		 }
		return resmap;
	}

	/**  周一 做
	 * 进入首页后 校验 该用户是否在职且存在 唯一标识
	 * @param bindcode
	 * @return
	 */
	@RequestMapping("/findBybindcodeToOpenId")
	public  Map<String,Object> findBybindcodeToOpenId(String bindcode,String resCode,String openid){
		TbBindingWechat tbBindingWechat;
		Map<String,Object> map = new HashMap<>();

		if(bindcode == null || "".equals(bindcode)){
			if(openid != null && !"".equals(openid)){
				tbBindingWechat =tbBindingWechatService.findByOpenid(openid);
			}
			else {
				JSONObject json = getUserInfo(resCode);
				openid = json.getString("openid");
				tbBindingWechat =tbBindingWechatService.findByOpenid(openid);
			}
		}else {
			tbBindingWechat= tbBindingWechatService.findBybidcodetToOpenId(bindcode);
		}
		String code = "0";//进入绑定页面
	    if(tbBindingWechat != null){
	 	if((tbBindingWechat.getOpenId() != null && !"".equals(tbBindingWechat.getOpenId())) && tbBindingWechat.getState().equals("在职")){
			code = "1";
			map.put("dept",tbBindingWechat.getDepartment());
			map.put("name",tbBindingWechat.getUserName());
			map.put("openid",tbBindingWechat.getOpenId());
			map.put("empid",tbBindingWechat.getUserId());
		}
	 }

		map.put("code",code);
		return  map;
	}

	/**
	 * 通过绑定码 回显实体数据
	 * @param code
	 * @return
	 */
	@RequestMapping("/finOneByCode")
	public  @ResponseBody Map<String,Object>  finOneByCode(String code){

		if(code != null){
				TbBindingWechat tbBindingWechat = tbBindingWechatService.finOneByCode(code);
				Map<String,Object> map = new HashMap<>();
				if(tbBindingWechat != null){
					map.put("status","0");//在当前页进行绑定业务
					map.put("data",tbBindingWechat);
					return map;
				}
				else{
					return null;
				}
			}

		return null;
	}

	/**
	 * 通过工号和 绑定 进行工号和绑定码的唯一性绑定
	 * @param code 微信获得openid
	 * @param userId  工号
	 * @param openid
	 * @return
	 */
	@RequestMapping("/bindUser")
	public @ResponseBody Map<String,Object> bindUser(String code,String userId,String openid){
		String sessionKey = null;
		Long id = new Long(userId);
		TbBindingWechat entity = tbBindingWechatService.findOne(id);

		if(openid == null || "".equals(openid)){
//			wxCode = code;
			JSONObject json = getUserInfo(code);
			String inopenId = json.getString("openid");
			sessionKey = json.getString("session_key");

			if(inopenId == null){
				entity.setOpenId(entity.getSpare1());
			}else {
				entity.setOpenId(inopenId);
			}
			entity.setSessionKey(sessionKey);
			entity.setSpare1(inopenId);
		}else {
			entity.setOpenId(openid);
			entity.setSessionKey(sessionKey);
			entity.setSpare1(openid);
		}
		//修改该绑定数据的code有效性 1 为无效；已经被绑定过；
		entity.setStatus("1");

		Map<String,Object> map = new HashMap<>();
		try {
			tbBindingWechatService.update(entity);
            map.put("bindcode",entity.getCode());
            map.put("empid",entity.getUserId());
            map.put("dept",entity.getDepartment());
            map.put("name",entity.getUserName());
			map.put("status","0");
		}catch (Exception e){
			e.printStackTrace();
			map.put("status","1");
		}
		return  map;
	}


	@RequestMapping("/uplodfile")
	public String uplodfile(MultipartFile uploadfile_ant, HttpServletRequest request){
		File targetFile=null;
		logger.info("========处理小程序上传图片开始=========");
		try {
			// 获得文件名:
			String fileName = uploadfile_ant.getOriginalFilename();
			// 获得文件的扩展名:
			String extName = fileName.substring( fileName.lastIndexOf(".")+1 );
			//文件夹名称  按月份命名
			SimpleDateFormat flodFormat = new SimpleDateFormat("YYYYMM");
			String flod = flodFormat.format(new Date());//文件夹
			//文件名称 按时间+字符串命名
			String randid = UUID.randomUUID().toString();
			randid=randid.replaceAll("-","");

			SimpleDateFormat filenameOriginal = new SimpleDateFormat("YYYYMMddHHmmss");
			//外加六个随机数  防止同一时间文件名上传出现重复
			int i = new Random().nextInt(20);
			String newFileName = filenameOriginal.format(new Date())+randid.substring(i,i+6)+"."+extName;

			//获得存储的绝对路径
			String upload = request.getSession().getServletContext().getRealPath("upload");

			File file1 =new File(upload+"/"+flod);
			//如果文件夹不存在则创建
			if(!file1 .exists()  && !file1 .isDirectory()){
				file1 .mkdir();
			}

			//将图片存入问价夹
			targetFile = new File(file1, newFileName);
			uploadfile_ant.transferTo(targetFile);

			logger.info("========处理小程序上传图片结束=========");
			String resUrel = url+"/"+ flod+"/"+ newFileName;
			return resUrel;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("========处理小程序上传图片异常=========",e);

			return null;
		}
	}

	@RequestMapping("/signinother")
	public Map<String, Object> signinother(@RequestBody TbCheckInRecord checkInRecord) {
		Map<String, Object> map = new HashMap<>();
		try {
			SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = simpleDateFormat.parse(simpleDateFormat.format(new Date()));
			checkInRecord.setCheckTime(date);

			checkInRecord.setPicUrl(checkInRecord.getPicUrl().replaceAll("\"", ""));

			//查询当时的打卡次数进行修改打卡次数
			SimpleDateFormat simpleDateFormat1  = new SimpleDateFormat("yyyy-MM-dd");
			String cerStartStr = simpleDateFormat1.format(new Date())+" 00:00:00";
			String cerEndStr = simpleDateFormat1.format(new Date())+" 23:59:59";
			Date stdate =simpleDateFormat.parse(cerStartStr);
			Date endate =simpleDateFormat.parse(cerEndStr);

			TbCheckInRecord tbCheckInRecord =checkInRecordService.findByEmpIdDate(checkInRecord.getEmpId(),stdate, endate);
			if(tbCheckInRecord != null){
				//获得当前日 最近一次打卡是的次数记录  加1 个当前的打卡数据
				Integer checkNum = new Integer(tbCheckInRecord.getSpare0());
				checkInRecord.setSpare0((checkNum+1)+"");
				map.put("checkNum",checkNum+1);
			}else {
				checkInRecord.setSpare0(1+"");
				map.put("checkNum",1);
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
	 * @return
	 */
	@RequestMapping("/news")
	public  Map<String,Object> findnews(){
//		String newType = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");

		List<TbNew> banderList = tbNewService.findByType("轮播图");

		List<TbNew> boadrList = tbNewService.findByType("公告");

		List<TbNew> newList = tbNewService.findByType("新闻");

		for (TbNew obj: newList ) {
			try {
				String format = simpleDateFormat.format(obj.getNewTime());
				obj.setNewTime(simpleDateFormat.parse(simpleDateFormat.format(obj.getNewTime())));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		Map<String, Object> map  = new HashMap<>();

		map.put("banners",banderList);
		map.put("noticeList",boadrList);
		map.put("news",newList);
		return map;
	}

	/**
	 * 通过新闻id 查询新闻的具体类容
	 * @param id
	 * @return
	 */
	@RequestMapping("/findByid")
	public TbNew findByid(Long id){
		TbNew one = tbNewService.findOne(id);
		return one;
	}

	/**
	 *
	 * @param empid
	 * @return
	 */
	@RequestMapping("/getNotesByEmpid")
	public  List<Map<String ,Object>> getNotesByEmpid(String empid){

		//用于存放最后的封装数据
		List<Map<String ,Object>> listmain = new ArrayList<>();

		TbCheckInRecord checkInRecord  = new TbCheckInRecord();
		checkInRecord.setEmpId(empid);
		PageResult page = checkInRecordService.findPage(checkInRecord, 1, 50);

		List<TbCheckInRecord> rows = page.getRows();
		//根据日期封装打卡的数据
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日");
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm:ss");
		String eqcurrentDate = null;
		List<Map<String ,Object>> listchild = null;
		if(rows != null && rows.size()>0){
			for (int i = 0;i < rows.size();i++){
				TbCheckInRecord tbCheckInRecord = rows.get(i);
				String currentDate = simpleDateFormat.format(tbCheckInRecord.getCheckTime());
				String currentTime = simpleDateFormat1.format(tbCheckInRecord.getCheckTime());

				if(eqcurrentDate != null && eqcurrentDate.equals(currentDate)){
					if(listchild == null){
						listchild = new ArrayList<>();
					}
					Map<String ,Object> mapchild = new HashMap<>();
					mapchild.put("empid",tbCheckInRecord.getEmpId());
					mapchild.put("name",tbCheckInRecord.getName());
					mapchild.put("localname",tbCheckInRecord.getLocalName());
					mapchild.put("currentTime",currentTime);
					mapchild.put("id",i*10);
					listchild.add(mapchild);

					if(i == rows.size()-1){
						Map<String ,Object> map = new HashMap<>();
						map.put("listchild",listchild);
						listchild = null;//进行最后的数据封装后 将子list清空  用到是重新实例化
						map.put("eqcurrentDate",eqcurrentDate);
						map.put("id",i);
						listmain.add(map);
					}
				}else {
					if(i != 0 ){//第一次进入时不进行最后的数据封装
						Map<String ,Object> map = new HashMap<>();
						map.put("listchild",listchild);
						listchild = null;
						map.put("eqcurrentDate",eqcurrentDate);
						map.put("id",i);
						listmain.add(map);
					}else  if(i ==0 && rows.size() == 1){//如果只有一条数据  则进入保存最后的封装
						Map<String ,Object> map = new HashMap<>();
						map.put("listchild",listchild);
						listchild = null;
						map.put("eqcurrentDate",eqcurrentDate);
						map.put("id",i);
						listmain.add(map);
					}
					if(listchild == null){
						listchild = new ArrayList<>();
					}
					Map<String ,Object> mapchild = new HashMap<>();
					mapchild.put("id",i*10);
					mapchild.put("empid",tbCheckInRecord.getEmpId());
					mapchild.put("name",tbCheckInRecord.getName());
					mapchild.put("localname",tbCheckInRecord.getLocalName());
					mapchild.put("currentTime",currentTime);
					listchild.add(mapchild);//将数据封装到子数据列表中
				}

				eqcurrentDate = currentDate;//用于比较日期
			}
		}
		return  listmain;
	}


























	@RequestMapping("/getOpenid")
	public  String getOpenid(String code){
		String openid = null;
		JSONObject json = getUserInfo(code);
		openid = json.getString("openid");
//		sessionKey = json.getString("session_key");
		return openid;
	}
	/**
	 * 获取openID和会话密匙
	 * @return
	 */
	public JSONObject getUserInfo(String code){
		// 获取session_key和openid
		JSONObject json = WXAppletUserInfo.getSessionKeyAndOropenid(code,appId,appSecret);
		return json;
	}

}
