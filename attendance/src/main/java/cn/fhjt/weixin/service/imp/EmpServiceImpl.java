package cn.fhjt.weixin.service.imp;

import cn.fhjt.weixin.mapper.EmpMapper;
import cn.fhjt.weixin.pojo.Emp;
import cn.fhjt.weixin.pojo.EmpExample;
import cn.fhjt.weixin.service.EmpService;
import cn.fhjt.weixin.utils.CustomerContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp findOne(String empId) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_SQLSERVER);
        EmpExample example = new EmpExample();
        example.createCriteria().andEmpIdEqualTo(empId);
        List<Emp> lsUser = empMapper.selectByExample(example);
        if(lsUser != null && lsUser.size()>0){
            return lsUser.get(0);
        }
        return null;
    }

    @Override
    public List<Emp> findByEmp(Emp emp) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_SQLSERVER);
        EmpExample example = new EmpExample();
        EmpExample.Criteria cri = example.createCriteria();
        boolean notName = false;
        boolean notEmpId = false;
        emp = emp == null ? new Emp(): emp;
        if(emp.getName() != null && !"".equals(emp.getName())){
            cri.andNameEqualTo(emp.getName());
        }
        else {
            notName =true;
        }
        if(emp.getEmpId() != null && !"".equals( emp.getEmpId())){
            cri.andEmpIdEqualTo(emp.getEmpId());
        }
        else{
            notEmpId = true ;
        }

        if(notName && notEmpId){
            return null;
        }else {
            return  empMapper.selectByExample(example);
        }
    }
}
