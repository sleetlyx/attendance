package cn.fhjt.weixin.service;

import cn.fhjt.weixin.pojo.Emp;

import java.util.List;

public interface EmpService {

    /**
     * 通过工号 查询实体
     * @param empId
     * @return
     */
    Emp findOne(String empId);

    /**
     * t通过工号,姓名查询员工信息
     * @param
     * @return
     */
    List<Emp> findByEmp(Emp emp);
}
