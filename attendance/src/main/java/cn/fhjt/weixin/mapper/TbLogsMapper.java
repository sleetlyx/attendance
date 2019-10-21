package cn.fhjt.weixin.mapper;

import cn.fhjt.weixin.pojo.TbLogs;
import cn.fhjt.weixin.pojo.TbLogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLogsMapper {
    int countByExample(TbLogsExample example);

    int deleteByExample(TbLogsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbLogs record);

    int insertSelective(TbLogs record);

    List<TbLogs> selectByExample(TbLogsExample example);

    TbLogs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbLogs record, @Param("example") TbLogsExample example);

    int updateByExample(@Param("record") TbLogs record, @Param("example") TbLogsExample example);

    int updateByPrimaryKeySelective(TbLogs record);

    int updateByPrimaryKey(TbLogs record);
}