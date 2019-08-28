package cn.fhjt.weixin.service.imp;

import cn.fhjt.weixin.mapper.TbBindingWechatMapper;
import cn.fhjt.weixin.pojo.TbBindingWechat;
import cn.fhjt.weixin.pojo.TbBindingWechatExample;
import cn.fhjt.weixin.pojo.entity.PageResult;
import cn.fhjt.weixin.service.TbBindingWechatService;
import cn.fhjt.weixin.utils.CustomerContextHolder;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TbBindingWechatServiceImpl implements TbBindingWechatService {

    @Autowired
    private TbBindingWechatMapper bindingWechatMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbBindingWechat> findAll() {
        return bindingWechatMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
        PageHelper.startPage(pageNum, pageSize);
        Page<TbBindingWechat> page=   (Page<TbBindingWechat>) bindingWechatMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(TbBindingWechat bindingWechat) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
        bindingWechatMapper.insert(bindingWechat);
    }


    /**
     * 修改
     */
    @Override
    public void update(TbBindingWechat bindingWechat){
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);

        bindingWechatMapper.updateByPrimaryKey(bindingWechat);
    }

    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    @Override
    public TbBindingWechat findOne(Long id){
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);

        return bindingWechatMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
        for(Long id:ids){
            bindingWechatMapper.deleteByPrimaryKey(id);
        }
    }


    @Override
    public PageResult findPage(TbBindingWechat bindingWechat, int pageNum, int pageSize) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
        PageHelper.startPage(pageNum, pageSize);

        TbBindingWechatExample example=new TbBindingWechatExample();
        TbBindingWechatExample.Criteria criteria = example.createCriteria();

        if(bindingWechat!=null){
            if(bindingWechat.getCode()!=null && bindingWechat.getCode().length()>0){
                criteria.andCodeLike("%"+bindingWechat.getCode()+"%");
            }
            if(bindingWechat.getUserName()!=null && bindingWechat.getUserName().length()>0){
                criteria.andUserNameLike("%"+bindingWechat.getUserName()+"%");
            }
            if(bindingWechat.getOperator()!=null && bindingWechat.getOperator().length()>0){
                criteria.andOperatorLike("%"+bindingWechat.getOperator()+"%");
            }
            if(bindingWechat.getOpenId()!=null && bindingWechat.getOpenId().length()>0){
                criteria.andOpenIdLike("%"+bindingWechat.getOpenId()+"%");
            }
            if(bindingWechat.getSessionKey()!=null && bindingWechat.getSessionKey().length()>0){
                criteria.andSessionKeyLike("%"+bindingWechat.getSessionKey()+"%");
            }
            if(bindingWechat.getStatus()!=null && bindingWechat.getStatus().length()>0){
                criteria.andStatusLike("%"+bindingWechat.getStatus()+"%");
            }
            if(bindingWechat.getPhon()!=null && bindingWechat.getPhon().length()>0){
                criteria.andPhonLike("%"+bindingWechat.getPhon()+"%");
            }

        }

        Page<TbBindingWechat> page= (Page<TbBindingWechat>)bindingWechatMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

    //lyx

    @Override
//    @Transactional
    public TbBindingWechat findByDgenumber(String badgenumber) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
        TbBindingWechatExample example = new TbBindingWechatExample();
        Long lsid = new Long(badgenumber);
        example.createCriteria().andUserIdEqualTo(lsid);

        List<TbBindingWechat> bindingWechat = bindingWechatMapper.selectByExample(example);
        bindingWechat =  bindingWechat == null ? new ArrayList<TbBindingWechat>() : bindingWechat;
        if (bindingWechat.size() > 0) {
            return bindingWechat.get(0);
        }
        return null;
    }



    @Override
    public TbBindingWechat finOneByCode(String code) {

        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
        TbBindingWechatExample example =  new TbBindingWechatExample();
        TbBindingWechatExample.Criteria cri = example.createCriteria();
        cri.andCodeEqualTo(code);
        //该数据的状态必须为 0 正常
        cri.andStatusEqualTo("0");
        List<TbBindingWechat> entityLise = bindingWechatMapper.selectByExample(example);
        if(entityLise != null && entityLise.size()>0){
            return entityLise.get(0);
        }else {
            return null;
        }
    }

    @Override
    public TbBindingWechat findBybidcodetToOpenId(String code) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);

        TbBindingWechatExample example = new TbBindingWechatExample();
        example.createCriteria().andCodeEqualTo(code);
        List<TbBindingWechat> tbBindingWechat = bindingWechatMapper.selectByExample(example);
        tbBindingWechat = tbBindingWechat == null ? new ArrayList<TbBindingWechat>() : tbBindingWechat;
        if(tbBindingWechat.size()> 0){
            return tbBindingWechat.get(0);
        }
        else{
            return null;
        }
    }

    @Override
    public TbBindingWechat finOneByCodeClear(String code) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
        TbBindingWechatExample example =  new TbBindingWechatExample();
        TbBindingWechatExample.Criteria cri = example.createCriteria();
        cri.andCodeEqualTo(code);
        cri.andStateEqualTo("离职");
        List<TbBindingWechat> entityLise = bindingWechatMapper.selectByExample(example);
        entityLise =  entityLise == null ? new ArrayList<TbBindingWechat>() : entityLise;
        if(entityLise.size()>0){
            return entityLise.get(0);
        }else {
            return new TbBindingWechat();
        }
    }

    /**
     * 通过openID查询 员工绑定表
     * @param openid
     * @return
     */
    @Override
    public TbBindingWechat findByOpenid(String openid) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);

        TbBindingWechatExample example = new TbBindingWechatExample();
        example.createCriteria().andOpenIdEqualTo(openid);
        List<TbBindingWechat> tbBindingWechat = bindingWechatMapper.selectByExample(example);
        tbBindingWechat = tbBindingWechat == null ? new ArrayList<TbBindingWechat>() : tbBindingWechat;
        if(tbBindingWechat.size()> 0){
            return tbBindingWechat.get(0);
        }
        else{
            return null;
        }
    }

}
