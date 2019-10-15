package cn.fhjt.weixin.service;

import cn.fhjt.weixin.pojo.LsUserinfo;

import java.util.List;

public interface LsUserService {

    LsUserinfo findLsUserInfo();

    /**
     * t通过工号,姓名查询员工信息
     * @param
     * @return
     */
    List<LsUserinfo> findBybadge(LsUserinfo userinfo);

    /**
     * 通过id查询实体  且返回绑定码
     * @param id
     * @return
     */
    LsUserinfo findOne(Integer id);
}
