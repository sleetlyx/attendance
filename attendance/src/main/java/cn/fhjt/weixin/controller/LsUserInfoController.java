package cn.fhjt.weixin.controller;

import cn.fhjt.weixin.pojo.LsUserinfo;
import cn.fhjt.weixin.pojo.TbBindingWechat;
import cn.fhjt.weixin.service.LsUserService;
import cn.fhjt.weixin.service.TbBindingWechatService;
import cn.fhjt.weixin.utils.WXAppletUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * LsUserController  废弃
 */
@RestController
@RequestMapping("/lsuser_fq")
public class LsUserInfoController {

    @Autowired
    private LsUserService lsUserService;

    @Autowired
    private TbBindingWechatService tbBindingWechatService;

    private  String  wxcode = null;

    /**
     * 通过工号,姓名查询实体
     * @param
     * @return
     */
    @RequestMapping("/findBybadge")
    public List<LsUserinfo> findBybadge(@RequestBody LsUserinfo userinfo){
        wxcode = null;
       List<LsUserinfo> lsUser = lsUserService.findBybadge(userinfo);
       if(lsUser != null && lsUser.size()>0){
           return lsUser;
       }else {
           return null;
       }

    }

    /**
     * 通过id获得实体
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    public Map<String,Object> findOne(Integer id){
        Map<String,Object> map = new HashMap<>();
        LsUserinfo lsuser = lsUserService.findOne(id);
        if(wxcode == null){
            //生成随机的六位数字
            wxcode =  WXAppletUserInfo.wxcode(6);
            wxcode = this.getCode(wxcode);
            //生成绑定码后将对应的数据 先保存一部分到  绑定微信表中
            //防止 保存后 离开当前网页生成新的code 再进行保存   工号进行校验是否存在
           TbBindingWechat idtbBindingWechat = tbBindingWechatService.findByDgenumber(lsuser.getBadgenumber());
           //绑定表中没有该code数据  则进行添加相应的数据
           if(idtbBindingWechat == null){
               TbBindingWechat tbBindingWechat =  new TbBindingWechat();
               tbBindingWechat.setCode(wxcode);
               //将工号作为id
               Long lId = new Long(lsuser.getBadgenumber());
               tbBindingWechat.setUserId(lId);
               tbBindingWechat.setUserName(lsuser.getName());
               tbBindingWechat.setStatus("0");
               tbBindingWechat.setCreated(new Date());
               tbBindingWechat.setPhon(lsuser.getPhone());
               //获得当前的登录管理员名称
//            TODO
//          tbBindingWechat.setOperator();
               // 需要切换当前线程的数据源
               tbBindingWechatService.add(tbBindingWechat);
           }else {
               wxcode = "该员工已经绑定过,绑定码为："+idtbBindingWechat.getCode();
           }
        }
        map.put("data",lsuser);
        //生成随机六位数的绑定码
        map.put("wxcode", wxcode);
        wxcode =  null;
        return map;
    }
    //校验该code是否存在
    public String getCode(String code){
        TbBindingWechat isexitEntity = tbBindingWechatService.finOneByCode(code);
        if(isexitEntity != null){
            code =  WXAppletUserInfo.wxcode(6);
            this.getCode(code);
        }
        return  code ;
    }
}
