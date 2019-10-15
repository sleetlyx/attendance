package cn.fhjt.weixin.mapper;

import cn.fhjt.weixin.pojo.TbNewPic;
import cn.fhjt.weixin.pojo.TbNewPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNewPicMapper {
    int countByExample(TbNewPicExample example);

    int deleteByExample(TbNewPicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbNewPic record);

    int insertSelective(TbNewPic record);

    List<TbNewPic> selectByExample(TbNewPicExample example);

    TbNewPic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbNewPic record, @Param("example") TbNewPicExample example);

    int updateByExample(@Param("record") TbNewPic record, @Param("example") TbNewPicExample example);

    int updateByPrimaryKeySelective(TbNewPic record);

    int updateByPrimaryKey(TbNewPic record);
}