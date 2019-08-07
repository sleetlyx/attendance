package cn.fhjt.weixin.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;


import cn.fhjt.weixin.pojo.TbBindingWechat;
import cn.fhjt.weixin.pojo.TbCheckInRecord;
import cn.fhjt.weixin.service.CheckInRecordService;
import cn.fhjt.weixin.service.TbBindingWechatService;
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


	//开发者APPID
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
	//从小程序获取的随机字符串
	public String wxCode;
	//存储openId 和密匙
	private  String openid = null;
	private  String secret = null;

	@Autowired
	private TbBindingWechatService tbBindingWechatService;

	@Autowired
	private CheckInRecordService checkInRecordService;

	
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
		wxCode = code;
		//获取当前微信用户的唯一标识
		JSONObject json = getUserInfo();
		 openid = json.getString("openid");
		 secret = json.getString("session_key");
		//通过唯一表示  判断是否存在数据
		 TbBindingWechat bidwechat = tbBindingWechatService.findByOpenid(openid);
		 if(bidwechat == null){
		 	//code 响应状态码
			 resmap.put("code", 0);//没过绑定
			 resmap.put("openid", openid);
		 }
		 else {
			 resmap.put("code", 1);//已经绑定过
			 resmap.put("openid",openid);
			 resmap.put("sessionKey",secret);
			 resmap.put("bindcode",bidwechat.getCode());
			 resmap.put("empid",bidwechat.getUserId());
//			 resmap.put("dept",bidwechat.getDepartment());
//			 resmap.put("name",bidwechat.getDepartment());


		 }
		return resmap;
	}

	/**
	 * 进入首页后 校验 该用户是否在职且存在 唯一标识
	 * @param bindcode
	 * @return
	 */
	@RequestMapping("/findBybindcodeToOpenId")
	public  String findBybindcodeToOpenId(String bindcode){
	 TbBindingWechat tbBindingWechat = tbBindingWechatService.findBybidcodetToOpenId(bindcode);
	 String code = "0";//进入绑定页面
	 if(tbBindingWechat != null){
	 	if((tbBindingWechat.getOpenId() != null && !"".equals(tbBindingWechat.getOpenId())) && tbBindingWechat.getState().equals("在职")){
			code = "1";
		}
	 }
		return  code;
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
	 * @param code
	 * @param userId
	 * @return
	 */
	@RequestMapping("/bindUser")
	public @ResponseBody Map<String,Object> bindUser(String code,String userId){

		Long id = new Long(userId);
		TbBindingWechat entity = tbBindingWechatService.findOne(id);

		if(openid == null){
			wxCode = code;
			JSONObject json = getUserInfo();
			String inopenId = json.getString("openid");
			String sessionKey = json.getString("session_key");

			if(inopenId == null){
				entity.setOpenId(entity.getSpare1());
			}else {
				entity.setOpenId(inopenId);
			}
			entity.setSessionKey(sessionKey);
			entity.setSpare1(inopenId);
		}else {
			entity.setOpenId(openid);
			entity.setSessionKey(secret);
			entity.setSpare1(openid);
		}
		//修改该绑定数据的code有效性 1 为无效；已经被绑定过；
		entity.setStatus("1");

		Map<String,Object> map = new HashMap<>();
		try {
			tbBindingWechatService.update(entity);
			map.put("status","0");
		}catch (Exception e){
			e.printStackTrace();
			map.put("status","1");
		}
		return  map;
	}



	/**
	 * 获取openID和会话密匙
	 * @return
	 */
	public JSONObject getUserInfo(){
		// 获取session_key和openid
		JSONObject json = WXAppletUserInfo.getSessionKeyAndOropenid(wxCode,appId,appSecret);
		return json;
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
			String flod = flodFormat.format(new Date());
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
			checkInRecord.setCheckTime(new Date());
			checkInRecord.setPicUrl(checkInRecord.getPicUrl().replaceAll("\"", ""));
			checkInRecordService.add(checkInRecord);
			map.put("status", 0);
			return map;
		} catch (Exception e) {
			map.put("status", 1);
			return map;
		}
	}

}
