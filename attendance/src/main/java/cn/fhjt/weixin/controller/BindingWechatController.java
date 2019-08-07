package cn.fhjt.weixin.controller;

import cn.fhjt.weixin.pojo.TbBindingWechat;
import cn.fhjt.weixin.pojo.entity.PageResult;
import cn.fhjt.weixin.pojo.entity.Result;
import cn.fhjt.weixin.service.TbBindingWechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/bindingWechat")
public class BindingWechatController {

	@Autowired
	private TbBindingWechatService bindingWechatService;
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return bindingWechatService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param bindingWechat
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbBindingWechat bindingWechat){
		try {
			bindingWechatService.add(bindingWechat);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param bindingWechat
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbBindingWechat bindingWechat){
		try {
			bindingWechatService.update(bindingWechat);
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
	public TbBindingWechat findOne(Long id){
		return bindingWechatService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			bindingWechatService.delete(ids);
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
	public PageResult search(@RequestBody TbBindingWechat bindingWechat, int page, int rows  ){
		return bindingWechatService.findPage(bindingWechat, page, rows);		
	}
	
}
