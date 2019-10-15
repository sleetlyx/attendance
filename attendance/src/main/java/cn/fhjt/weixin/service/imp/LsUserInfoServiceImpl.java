package cn.fhjt.weixin.service.imp;

import cn.fhjt.weixin.mapper.LsUserinfoMapper;
import cn.fhjt.weixin.pojo.LsUserinfo;
import cn.fhjt.weixin.pojo.LsUserinfoExample;
import cn.fhjt.weixin.service.LsUserService;
import cn.fhjt.weixin.utils.CustomerContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LsUserInfoServiceImpl implements LsUserService {

    @Autowired
    private LsUserinfoMapper lsUserinfoMapper;

    @Override
    public LsUserinfo findLsUserInfo() {
        //将数据源切换为 sqlserver
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_SQLSERVER);
        List<LsUserinfo> listLsUsr = lsUserinfoMapper.selectByExample(null);
        return listLsUsr.get(20);
    }

    @Override
    public List<LsUserinfo> findBybadge(LsUserinfo userinfo) {

        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_SQLSERVER);
        LsUserinfoExample example = new LsUserinfoExample();
        LsUserinfoExample.Criteria cri = example.createCriteria();
        if(userinfo.getName() != null && !"".equals(userinfo.getName())){
            cri.andNameEqualTo(userinfo.getName());
        }
        if(userinfo.getBadgenumber() != null && !"".equals( userinfo.getBadgenumber())){
            cri.andBadgenumberEqualTo(userinfo.getBadgenumber());
        }
        List<LsUserinfo> listLsUsr = lsUserinfoMapper.selectByExample(example);
        return listLsUsr;
    }

    @Override
    public LsUserinfo findOne(Integer id) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_SQLSERVER);
        LsUserinfoExample example = new LsUserinfoExample();
        example.createCriteria().andUseridEqualTo(id);
        List<LsUserinfo> lsUser = lsUserinfoMapper.selectByExample(example);
        return lsUser.get(0);
    }
}
