package cn.fhjt.weixin.mapper;

import cn.fhjt.weixin.pojo.Emp;
import cn.fhjt.weixin.pojo.EmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    int countByExample(EmpExample example);

    int deleteByExample(EmpExample example);

    int insert(Emp record);

    int insertSelective(Emp record);

    List<Emp> selectByExample(EmpExample example);

    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    List<Emp> findempByemp(Emp emp);

    int updateByPrimaryKey(Emp emp);
    int updateStateByempid(Emp emp);
}