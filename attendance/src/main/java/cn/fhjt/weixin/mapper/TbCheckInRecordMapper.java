package cn.fhjt.weixin.mapper;

import cn.fhjt.weixin.pojo.TbCheckInRecord;
import cn.fhjt.weixin.pojo.TbCheckInRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCheckInRecordMapper {
    int countByExample(TbCheckInRecordExample example);

    int deleteByExample(TbCheckInRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCheckInRecord record);

    int insertSelective(TbCheckInRecord record);

    List<TbCheckInRecord> selectByExample(TbCheckInRecordExample example);

    TbCheckInRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCheckInRecord record, @Param("example") TbCheckInRecordExample example);

    int updateByExample(@Param("record") TbCheckInRecord record, @Param("example") TbCheckInRecordExample example);

    int updateByPrimaryKeySelective(TbCheckInRecord record);

    int updateByPrimaryKey(TbCheckInRecord record);
}