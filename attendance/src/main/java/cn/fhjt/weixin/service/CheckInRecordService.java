package cn.fhjt.weixin.service;
import java.util.Date;
import java.util.List;

import cn.fhjt.weixin.pojo.TbCheckInRecord;
import cn.fhjt.weixin.pojo.entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CheckInRecordService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCheckInRecord> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(TbCheckInRecord checkInRecord, int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbCheckInRecord checkInRecord);
	
	
	/**
	 * 修改
	 */
	public void update(TbCheckInRecord checkInRecord);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCheckInRecord findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbCheckInRecord checkInRecord, int pageNum, int pageSize, Date start,Date end);


	/**
	 *  通过工号 和当天的起始日 结束日 获得当日的打卡次数
	 * @param empId
	 * @param stdate
	 * @param endate
	 * @return
	 */
    TbCheckInRecord findByEmpIdDate(String empId, Date stdate, Date endate);
}
