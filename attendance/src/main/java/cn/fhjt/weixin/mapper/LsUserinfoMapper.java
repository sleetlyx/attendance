package cn.fhjt.weixin.mapper;

import cn.fhjt.weixin.pojo.LsUserinfo;
import cn.fhjt.weixin.pojo.LsUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LsUserinfoMapper {
    int countByExample(LsUserinfoExample example);

    int deleteByExample(LsUserinfoExample example);

    int insert(LsUserinfo record);

    int insertSelective(LsUserinfo record);

    List<LsUserinfo> selectByExample(LsUserinfoExample example);

    int updateByExampleSelective(@Param("record") LsUserinfo record, @Param("example") LsUserinfoExample example);

    int updateByExample(@Param("record") LsUserinfo record, @Param("example") LsUserinfoExample example);
}