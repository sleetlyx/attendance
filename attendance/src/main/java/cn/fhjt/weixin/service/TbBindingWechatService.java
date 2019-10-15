package cn.fhjt.weixin.service;

import cn.fhjt.weixin.pojo.TbBindingWechat;
import cn.fhjt.weixin.pojo.entity.PageResult;

import java.util.List;

public interface TbBindingWechatService {

    TbBindingWechat findByOpenid(String openid);

    /**
     * 返回全部列表
     * @return
     */
    public List<TbBindingWechat> findAll();


    /**
     * 返回分页列表
     * @return
     */
    public PageResult findPage(int pageNum,int pageSize);


    /**
     * 增加
     */
    public void add(TbBindingWechat bindingWechat);


    /**
     * 修改
     */
    public void update(TbBindingWechat bindingWechat);


    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public TbBindingWechat findOne(Long id);


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
    public PageResult findPage(TbBindingWechat bindingWechat, int pageNum,int pageSize);

    /**
     * 通过工号查询实体
     * @param badgenumber
     * @return
     */
    TbBindingWechat findByDgenumber(String badgenumber);
    /**
     * 通过绑定码 获取绑定表的实体数据
     * @param code
     */
    TbBindingWechat finOneByCode(String code);

    /**
     * 通过绑定码 校验openid 是否存在
     * @param code
     * @return
     */
    TbBindingWechat findBybidcodetToOpenId(String code);


    /*
    处理客户清理缓存的情况
     */
    TbBindingWechat finOneByCodeClear(String code);

    TbBindingWechat findByspOpenid(String openid);
}
