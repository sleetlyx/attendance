package cn.fhjt.weixin.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.fhjt.weixin.pojo.TbCheckInRecord;
import cn.fhjt.weixin.pojo.entity.PageResult;
import cn.fhjt.weixin.pojo.entity.Result;
import org.apache.log4j.Logger;
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

	private  final Logger logger =  Logger.getLogger(CheckInRecordController.class);

	@Autowired
	private CheckInRecordService checkInRecordService;
	

	


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
	public PageResult search(@RequestBody TbCheckInRecord checkInRecord, int page, int rows , String  startdate,String  enddate){

		Date start =null;
		Date end = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(startdate != null && !"undefined".equals(startdate)){
			try {
				start = sdf.parse(startdate);
				if(enddate == null || "undefined".equals(enddate)){
					end = sdf.parse(sdf.format(new Date()));
				}
				else {
					end = sdf.parse(enddate);
				}
			} catch (ParseException e) {
				logger.error("=====CheckInRecordController 中开始日期转换错误===="+e);
				e.printStackTrace();
			}
		}

		return checkInRecordService.findPage(checkInRecord, page, rows,start,end);
	}
	
}
