package cn.fhjt.weixin.service.imp;

import java.util.ArrayList;
import java.util.List;

import cn.fhjt.weixin.pojo.TbUserExample;
import cn.fhjt.weixin.pojo.entity.PageResult;
import cn.fhjt.weixin.utils.CustomerContextHolder;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.fhjt.weixin.mapper.TbUserMapper;
import cn.fhjt.weixin.pojo.TbUser;
import cn.fhjt.weixin.service.TbUserService;
@Service
public class TbUserServiceImpl implements TbUserService {
	@Autowired
	private TbUserMapper userMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<TbUser> findAll() {
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
		return userMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
		PageHelper.startPage(pageNum, pageSize);
		Page<TbUser> page=   (Page<TbUser>) userMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbUser user) {
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
		userMapper.insert(user);
	}


	/**
	 * 修改
	 */
	@Override
	public void update(TbUser user){
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
		userMapper.updateByPrimaryKey(user);
	}

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbUser findOne(Long id){
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
		return userMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
		for(Long id:ids){
			userMapper.deleteByPrimaryKey(id);
		}
	}


	@Override
	public PageResult findPage(TbUser user, int pageNum, int pageSize) {
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
		PageHelper.startPage(pageNum, pageSize);
		TbUserExample example=new TbUserExample();
		TbUserExample.Criteria criteria = example.createCriteria();

		if(user!=null){
			if(user.getUserName()!=null && user.getUserName().length()>0){
				criteria.andUserNameLike("%"+user.getUserName()+"%");
			}
			if(user.getPassword()!=null && user.getPassword().length()>0){
				criteria.andPasswordLike("%"+user.getPassword()+"%");
			}
			if(user.getPhone()!=null && user.getPhone().length()>0){
				criteria.andPhoneLike("%"+user.getPhone()+"%");
			}
			if(user.getName()!=null && user.getName().length()>0){
				criteria.andNameLike("%"+user.getName()+"%");
			}
			if(user.getStatus()!=null && user.getStatus().length()>0){
				criteria.andStatusLike("%"+user.getStatus()+"%");
			}
			if(user.getSex()!=null && user.getSex().length()>0){
				criteria.andSexLike("%"+user.getSex()+"%");
			}

		}

		Page<TbUser> page= (Page<TbUser>)userMapper.selectByExample(example);
		List<TbUser> result = page.getResult();
		if(result != null && result.size()>0){
			for (TbUser tbUser: result ) {
				if("0".equals(tbUser.getSex())){
					tbUser.setSex("男");
				}else {
					tbUser.setSex("女");
				}
				if("0".equals(tbUser.getStatus())){
					tbUser.setStatus("正常");
				}else {
					tbUser.setStatus("失效");
				}
			}
		}
		return new PageResult(page.getTotal(),result);
	}

	@Override
	public void updateByIds(Long[] ids) {
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
		for (Long userId: ids) {
			TbUser tbUser = userMapper.selectByPrimaryKey(userId);
			tbUser.setStatus("1");
			userMapper.updateByPrimaryKeySelective(tbUser);
		}
	}

	/**
	 * 根据 name 进行是否存在
	 * @param userName
	 * @return
	 */
	@Override
	public TbUser findByName(String userName) {
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
		TbUserExample example = new TbUserExample();

		if(userName != null && !"".equals(userName)){
			example.createCriteria().andUserNameEqualTo(userName);
			List<TbUser>  userList= userMapper.selectByExample(example);
			userList= userList == null ? new ArrayList<TbUser>() : userList;
			if(userList.size() > 0){
				return userList.get(0);
			}else {
				return null;
			}
		}
		else {
			return null;
		}

	}

	@Override
	public TbUser findInfo() {
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
		 List<TbUser> listUser = userMapper.selectByExample(null);
		return listUser.get(0);
	}

}
