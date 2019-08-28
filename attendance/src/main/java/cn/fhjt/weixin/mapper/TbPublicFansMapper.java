package cn.fhjt.weixin.mapper;

import cn.fhjt.weixin.pojo.TbPublicFans;
import cn.fhjt.weixin.pojo.TbPublicFansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPublicFansMapper {
    int countByExample(TbPublicFansExample example);

    int deleteByExample(TbPublicFansExample example);

    int insert(TbPublicFans record);

    int insertSelective(TbPublicFans record);

    List<TbPublicFans> selectByExample(TbPublicFansExample example);

    int updateByExampleSelective(@Param("record") TbPublicFans record, @Param("example") TbPublicFansExample example);

    int updateByExample(@Param("record") TbPublicFans record, @Param("example") TbPublicFansExample example);

    void truncateFunction();
}