package cn.fhjt.weixin.mapper;

import cn.fhjt.weixin.pojo.TbBindingWechat;
import cn.fhjt.weixin.pojo.TbBindingWechatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBindingWechatMapper {
    int countByExample(TbBindingWechatExample example);

    int deleteByExample(TbBindingWechatExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(TbBindingWechat record);

    int insertSelective(TbBindingWechat record);

    List<TbBindingWechat> selectByExample(TbBindingWechatExample example);

    TbBindingWechat selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") TbBindingWechat record, @Param("example") TbBindingWechatExample example);

    int updateByExample(@Param("record") TbBindingWechat record, @Param("example") TbBindingWechatExample example);

    int updateByPrimaryKeySelective(TbBindingWechat record);

    int updateByPrimaryKey(TbBindingWechat record);
}