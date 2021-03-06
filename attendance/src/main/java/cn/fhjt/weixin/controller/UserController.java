package cn.fhjt.weixin.controller;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.fhjt.weixin.pojo.Emp;
import cn.fhjt.weixin.pojo.TbUser;
import cn.fhjt.weixin.pojo.entity.PageResult;
import cn.fhjt.weixin.pojo.entity.Result;
import cn.fhjt.weixin.service.EmpService;
import cn.fhjt.weixin.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {


	@Autowired
	private TbUserService tbUserService;
	@Autowired
	private EmpService empService;

	/**
	 * 增加
	 * @param user
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbUser user){
		try {
			user.setCreated(new Date());
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			user.setPassword(passwordEncoder.encode(user.getPassword().trim()));
			tbUserService.add(user);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param user
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbUser user){
		try {
			tbUserService.update(user);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbUser findOne(Long id){
		return tbUserService.findOne(id);
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			tbUserService.updateByIds(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbUser user, int page, int rows  ){
		return tbUserService.findPage(user, page, rows);
	}

	/**
	 * 检查 添加加用户时工号可用否
	 * @param empId
	 * @return
	 */
	@RequestMapping("/checkEmpId")
	public  Result checkEmpId(String empId){
		Emp emp = null;
		if(empId != null && !empId.equals("undefined")){
			 emp = empService.findOne(empId);
		}

		if(emp == null){
			return  new Result(false,"该工号不存在，请输入正确的工号！");
		}
		else {
			Long longid = Long.parseLong(empId);
			TbUser user = tbUserService.findOne(longid);
			if(user != null){
				return new Result(true,"该工号已经存在");
			}else {
				Map<String,Object> map = new HashMap<>();
				map.put("phone",emp.getMobile());
				map.put("name",emp.getName());
				map.put("sex",emp.getSex().equals("A")? "0":"1");
				return new Result(true,"该工号可用",map);
			}

		}

	}
	
}
