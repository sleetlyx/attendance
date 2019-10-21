package cn.fhjt.weixin.service.imp;
import cn.fhjt.weixin.mapper.TbCheckInRecordMapper;
import cn.fhjt.weixin.pojo.TbCheckInRecord;
import cn.fhjt.weixin.pojo.TbCheckInRecordExample;
import cn.fhjt.weixin.pojo.entity.PageResult;
import cn.fhjt.weixin.utils.CustomerContextHolder;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.PageHelper;
import cn.fhjt.weixin.service.CheckInRecordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CheckInRecordServiceImpl implements CheckInRecordService {

	@Autowired
	private TbCheckInRecordMapper checkInRecordMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCheckInRecord> findAll() {
		return checkInRecordMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(TbCheckInRecord checkInRecord,int pageNum, int pageSize) {

		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);

		PageHelper.startPage(pageNum, pageSize);
		TbCheckInRecordExample example = new TbCheckInRecordExample();
		example.setOrderByClause("id desc");
		if(checkInRecord.getEmpId() != null){
			example.createCriteria().andEmpIdEqualTo(checkInRecord.getEmpId());
			Page<TbCheckInRecord> page=   (Page<TbCheckInRecord>) checkInRecordMapper.selectByExample(example);
			return new PageResult(page.getTotal(), page.getResult());
		}
		else {
			return  null;
		}


	}

	/**
	 * 增加
	 */
	@Override
//	@Transactional(propagation= Propagation.REQUIRED)
	public void add(TbCheckInRecord checkInRecord) {
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);

		checkInRecordMapper.insert(checkInRecord);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCheckInRecord checkInRecord){
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);

		checkInRecordMapper.updateByPrimaryKey(checkInRecord);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCheckInRecord findOne(Long id){
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);

		return checkInRecordMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
		for(Long id:ids){
			checkInRecordMapper.deleteByPrimaryKey(id);
		}		
	}
		@Override
	public PageResult findPage(TbCheckInRecord checkInRecord, int pageNum, int pageSize , Date start, Date end) {
			CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);

//		Date parStart;
//		Date parEnd;

		PageHelper.startPage(pageNum, pageSize);
		TbCheckInRecordExample example=new TbCheckInRecordExample();
		example.setOrderByClause("id desc");
		TbCheckInRecordExample.Criteria criteria = example.createCriteria();


//		if(start != null){
//			parStart = start;
//		}
//		if(end != null){
//			parEnd = end;
//		}


		if(checkInRecord!=null){			
						if(checkInRecord.getEmpId()!=null && !"".equals(checkInRecord.getEmpId())){
				criteria.andEmpIdEqualTo(checkInRecord.getEmpId());
			}
			if(checkInRecord.getName()!=null && !"".equals(checkInRecord.getName())){
				criteria.andNameEqualTo(checkInRecord.getName());
			}
			if(start != null && end != null){
				criteria.andCheckTimeBetween(start,end);
			}



			if(checkInRecord.getDept()!=null && checkInRecord.getDept().length()>0){
				criteria.andDeptLike("%"+checkInRecord.getDept()+"%");
			}
			if(checkInRecord.getLocalName()!=null && checkInRecord.getLocalName().length()>0){
				criteria.andLocalNameLike("%"+checkInRecord.getLocalName()+"%");
			}
			if(checkInRecord.getLatitude()!=null && checkInRecord.getLatitude().length()>0){
				criteria.andLatitudeLike("%"+checkInRecord.getLatitude()+"%");
			}
			if(checkInRecord.getLongitude()!=null && checkInRecord.getLongitude().length()>0){
				criteria.andLongitudeLike("%"+checkInRecord.getLongitude()+"%");
			}
			if(checkInRecord.getRemarks()!=null && checkInRecord.getRemarks().length()>0){
				criteria.andRemarksLike("%"+checkInRecord.getRemarks()+"%");
			}
			if(checkInRecord.getPicUrl()!=null && checkInRecord.getPicUrl().length()>0){
				criteria.andPicUrlLike("%"+checkInRecord.getPicUrl()+"%");
			}
			if(checkInRecord.getSpare0()!=null && checkInRecord.getSpare0().length()>0){
				criteria.andSpare0Like("%"+checkInRecord.getSpare0()+"%");
			}
			if(checkInRecord.getSpare1()!=null && checkInRecord.getSpare1().length()>0){
				criteria.andSpare1Like("%"+checkInRecord.getSpare1()+"%");
			}
			if(checkInRecord.getSpare2()!=null && checkInRecord.getSpare2().length()>0){
				criteria.andSpare2Like("%"+checkInRecord.getSpare2()+"%");
			}
			if(checkInRecord.getSpare3()!=null && checkInRecord.getSpare3().length()>0){
				criteria.andSpare3Like("%"+checkInRecord.getSpare3()+"%");
			}
		}
		
		Page<TbCheckInRecord> page= (Page<TbCheckInRecord>)checkInRecordMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public TbCheckInRecord findByEmpIdDate(String empId, Date stdate, Date endate) {
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
		TbCheckInRecordExample example = new TbCheckInRecordExample();
		example.setOrderByClause("id desc");
		TbCheckInRecordExample.Criteria criteria = example.createCriteria();
		criteria.andEmpIdEqualTo(empId);
		criteria.andCheckTimeBetween(stdate,endate);
		List<TbCheckInRecord> tbCheckInRecords = checkInRecordMapper.selectByExample(example);

		if (tbCheckInRecords != null && tbCheckInRecords.size()>0){
			return  tbCheckInRecords.get(0);
		}else {
			return null;
		}

	}

}
