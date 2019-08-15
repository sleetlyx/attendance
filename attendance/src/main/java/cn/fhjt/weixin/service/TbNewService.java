package cn.fhjt.weixin.service;


import cn.fhjt.weixin.pojo.TbNew;
import cn.fhjt.weixin.pojo.entity.PageResult;

import java.util.List;

public interface TbNewService {


    /**
     * 增加
     */
    public void add(TbNew tbNew);


    /**
     * 修改
     */
    public void update(TbNew tbNew);


    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public TbNew findOne(Long id);


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
    public PageResult findPage(TbNew tbNew, int pageNum, int pageSize);

    /**
     * 根据所选择的数据  进行逻辑删除 更新状态
     * @param ids
     */
    void updateByIds(Long[] ids);

    /**
     * 根据 新闻的类型查询类容
     * @param newType
     * @return
     */
    List<TbNew> findByType(String newType);
}
