package cn.fhjt.weixin.mapper;

import cn.fhjt.weixin.pojo.SavePublicToken;

public interface SavePublicTokenMapper {
    public  SavePublicToken getToken();
    public  void  updateByPrimaryKeySelective(SavePublicToken savePublicToken);

    void insert(SavePublicToken publicNumberToken);
}
