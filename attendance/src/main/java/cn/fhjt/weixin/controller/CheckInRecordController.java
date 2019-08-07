package cn.fhjt.weixin.controller;
import java.util.List;

import cn.fhjt.weixin.pojo.TbCheckInRecord;
import cn.fhjt.weixin.pojo.entity.PageResult;
import cn.fhjt.weixin.pojo.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.fhjt.weixin.service.CheckInRecordService;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/checkInRecord")
public class CheckInRecordController {

	@Autowired
	private CheckInRecordService checkInRecordService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCheckInRecord> findAll(){
		return checkInRecordService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return checkInRecordService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param checkInRecord
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCheckInRecord checkInRecord){
		try {
			checkInRecordService.add(checkInRecord);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param checkInRecord
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCheckInRecord checkInRecord){
		try {
			checkInRecordService.update(checkInRecord);
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
	public TbCheckInRecord findOne(Long id){
		return checkInRecordService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			checkInRecordService.delete(ids);
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
	public PageResult search(@RequestBody TbCheckInRecord checkInRecord, int page, int rows  ){
		return checkInRecordService.findPage(checkInRecord, page, rows);		
	}
	
}
