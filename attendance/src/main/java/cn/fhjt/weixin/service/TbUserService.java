package cn.fhjt.weixin.service;

import cn.fhjt.weixin.pojo.TbUser;
import cn.fhjt.weixin.pojo.entity.PageResult;

import java.util.List;

public interface TbUserService {
	
	public TbUser findInfo();

	/**
	 * 服务层接口
	 * @author Administrator
	 *
	 */
		/**
		 * 返回全部列表
		 * @return
		 */
		public List<TbUser> findAll();


		/**
		 * 返回分页列表
		 * @return
		 */
		public PageResult findPage(int pageNum,int pageSize);


		/**
		 * 增加
		 */
		public void add(TbUser user);


		/**
		 * 修改
		 */
		public void update(TbUser user);


		/**
		 * 根据ID获取实体
		 * @param id
		 * @return
		 */
		public TbUser findOne(Long id);


		/**
		 * 批量删除
		 * @param ids
		 */
		public void delete(Long [] ids);

		/**
		 * 分页
		 * @param pageNum 当前页 码
		 * @param pageSize 每页记录数
		 * @return
		 */
		public PageResult findPage(TbUser user, int pageNum, int pageSize);

	/**
	 * 根据所选择的数据  进行逻辑删除 更新状态
	 * @param ids
	 */
	void updateByIds(Long[] ids);

    TbUser findByName(String userName);
}
