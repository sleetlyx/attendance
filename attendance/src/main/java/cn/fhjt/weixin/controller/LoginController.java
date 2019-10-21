package cn.fhjt.weixin.controller;

import cn.fhjt.weixin.pojo.Emp;
import cn.fhjt.weixin.pojo.LsUserinfo;
import cn.fhjt.weixin.service.EmpService;
import cn.fhjt.weixin.service.LsUserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.fhjt.weixin.pojo.TbUser;
import cn.fhjt.weixin.service.TbUserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/loginController")
public class LoginController {

	@Autowired
	private TbUserService tbUserService;

	@Autowired
	private LsUserService lsUserService;

	@Autowired
	private EmpService empService;
//	private UserDetailsServiceImpl userDetailsService = new UserDetailsServiceImpl();
//    @RequestMapping("/Mylogin")
//    public String login(String userName) {
//		UserDetails sdf = userDetailsService.loadUserByUsername(userName);
//        return "redirect:admin/index.html";
//    }
	@RequestMapping("/getUserInfo")
	public @ResponseBody
    TbUser getUserInfo() {
		TbUser findInfo = tbUserService.findInfo();
		return findInfo;
}
	@RequestMapping("/getLsUserInfo")
	public  @ResponseBody LsUserinfo getOLsUserInfo() {
		LsUserinfo lsUserInfo = lsUserService.findLsUserInfo();
		return lsUserInfo;
	}

	/**
	 * 从session 域中获取登录失败信息
	 * @param request
	 * @return
	 */
	@RequestMapping("/getLoginSession")
	public @ResponseBody Map<String,Object> getLoginSession(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<>();
		HttpSession session = request.getSession();
		Object spring_security_last_exception = session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION");//获取异常信息
//		System.out.println(spring_security_last_exception.toString()+"######################");
//		org.springframework.security.authentication.BadCredentialsException: Bad credentials
		String mesg = null;
		if (spring_security_last_exception != null){
			mesg =	"用户名或密码错误！";
		}

		map.put("loginMesg",mesg);

		return map;
	}
	@RequestMapping("/getUserName")
	public  @ResponseBody Map<String,Object> getUserName(HttpServletRequest request){
		Map<String,Object> map =  new HashMap<>();
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		//系统通过工号 作为登录用户  此处通过工号查询 用户的真实姓名
		Emp emp = empService.findOne(user.getUsername());
		HttpSession session = request.getSession();
		if(emp != null){
			session.setAttribute("userName",emp.getName());
			map.put("userName",emp.getName());
		}
		if(user.getUsername().equals("admin")){//超级管理员  进行特殊处理
			map.put("userName","超级管理员");
			session.setAttribute("userName","超级管理员");
			map.put("isfunction",true);//
			TbUser tbuser = tbUserService.findOne(1L);
			if(tbuser != null && request.getSession().getAttribute("empid") == null){
				request.getSession().setAttribute("empid",tbuser.getUserId());

				map.put("lastTime",tbuser.getLastLoginTime());
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String format = simpleDateFormat.format(new Date());
				try {
					request.getSession().setAttribute("lastTime",tbuser.getLastLoginTime());
					tbuser.setLastLoginTime(simpleDateFormat.parse(format));
					tbUserService.update(tbuser);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			else if(tbuser != null){
				map.put("lastTime",request.getSession().getAttribute("lastTime"));
			}

		}else {
			Long userId  = Long.parseLong(user.getUsername());
			TbUser tbuser = tbUserService.findOne(userId);
			if(tbuser != null && request.getSession().getAttribute("empid") == null){
				request.getSession().setAttribute("empid",tbuser.getUserId());
				if("非小程序管理员".equals(tbuser.getFunction())){
					map.put("isfunction",false);// 设置为false  进行菜单隐藏
				}else {
					map.put("isfunction",true);//
				}

				map.put("lastTime",tbuser.getLastLoginTime());
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String format = simpleDateFormat.format(new Date());
				try {
					request.getSession().setAttribute("lastTime",tbuser.getLastLoginTime());
					tbuser.setLastLoginTime(simpleDateFormat.parse(format));
					tbUserService.update(tbuser);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			else if(tbuser != null){
				if("非小程序管理员".equals(tbuser.getFunction())){
					map.put("isfunction",false);// 设置为false  进行菜单隐藏
				}else {
					map.put("isfunction",true);//
				}
				map.put("lastTime",request.getSession().getAttribute("lastTime"));
			}
		}

		return  map;
	}


}
