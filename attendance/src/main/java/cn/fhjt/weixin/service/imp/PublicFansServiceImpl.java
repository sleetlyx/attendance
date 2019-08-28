package cn.fhjt.weixin.service.imp;

import cn.fhjt.weixin.mapper.TbNewPicMapper;
import cn.fhjt.weixin.mapper.TbPublicFansMapper;
import cn.fhjt.weixin.pojo.TbPublicFans;
import cn.fhjt.weixin.service.PublicFansService;
import cn.fhjt.weixin.utils.CustomerContextHolder;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PublicFansServiceImpl implements PublicFansService {
    @Autowired
    private TbPublicFansMapper publicFansMapper;

    @Override
    public void save(List<JSONObject> jsonObjectAllList) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
        //truncate table table_name;
        publicFansMapper.truncateFunction();
        if(jsonObjectAllList != null && jsonObjectAllList.size()>0){
            for (JSONObject object:jsonObjectAllList) {

               List<Map<String,Object>> info_list=( List<Map<String,Object>>) object.get("user_info_list");

               for ( Map<String,Object> userInfo:info_list){
                   TbPublicFans publicFans = new TbPublicFans();
                   publicFans.setId(userInfo.get("openid").toString());
                   publicFans.setSubscribe(userInfo.get("subscribe").toString());
                   publicFans.setNickName(userInfo.get("nickname")==null? null: userInfo.get("nickname").toString());
                   publicFans.setSex(userInfo.get("sex").toString());
                   publicFans.setSubscribeTime(userInfo.get("subscribe_time").toString());
                   publicFans.setCountry(userInfo.get("country")==null? null: userInfo.get("country").toString());
                   publicFans.setProvince(userInfo.get("province")==null? null: userInfo.get("province").toString());
                   publicFans.setCity(userInfo.get("city")==null? null: userInfo.get("city").toString());
                   publicFansMapper.insert(publicFans);
               }//🐾"
                //"\uD83D\uDC3E"
            }
        }

    }
}
