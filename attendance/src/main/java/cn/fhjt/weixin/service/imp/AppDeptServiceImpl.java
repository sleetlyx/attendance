package cn.fhjt.weixin.service.imp;

import cn.fhjt.weixin.mapper.AppDeptMapper;
import cn.fhjt.weixin.pojo.AppDept;
import cn.fhjt.weixin.service.AppDeptService;
import cn.fhjt.weixin.utils.CustomerContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppDeptServiceImpl  implements AppDeptService {
    @Autowired
    private AppDeptMapper appDeptMapper;
    @Override
    public List<AppDept> findAllDepe() {

        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_SQLSERVER);
        return appDeptMapper.selectAll();

    }
}
