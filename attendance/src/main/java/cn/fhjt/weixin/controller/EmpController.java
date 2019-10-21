package cn.fhjt.weixin.controller;

import cn.fhjt.weixin.pojo.Emp;
import cn.fhjt.weixin.pojo.TbBindingWechat;
import cn.fhjt.weixin.pojo.entity.Result;
import cn.fhjt.weixin.service.EmpService;
import cn.fhjt.weixin.service.TbBindingWechatService;
import cn.fhjt.weixin.utils.WXAppletUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * 替换 LsUserController
 */
@RestController
@RequestMapping("/emp")
public class EmpController{

    @Autowired
    private EmpService empService;

    @Autowired
    private TbBindingWechatService tbBindingWechatService;

    private  String  wxcode = null;

    /**
     * 通过工号,姓名查询实体
     * @param
     * @return
     */
    @RequestMapping("/findBybadge")
    public List<Emp> findBybadge(@RequestBody(required = false) Emp emp, HttpServletRequest request){
        wxcode = null;
//        List<Emp> lsUser = empService.findByEmp(emp);
        List<Emp> lsUser = empService.findempByemp(emp);
        if(lsUser != null && lsUser.size()>0){
            for (Emp obj: lsUser ) {
                if(obj.getSex()!= null && obj.getSex().equals("A")){
                    obj.setSex("男");
                }else if(obj.getSex()!= null && obj.getSex().equals("B")) {
                    obj.setSex("女");
                }
                if(obj.getState() != null && obj.getState().equals("F")){
                    obj.setState("已离职");
                }else if(obj.getState() == null || obj.getState().equals("H")){
                    obj.setState("已离职");
                }else if(obj.getState() == null || obj.getState().equals("C")){
                    obj.setState("离职未办手续");
                }else {
                    obj.setState("在职");
                }
            }

//            SecurityContext ctx = SecurityContextHolder.getContext();
//            Authentication auth = ctx.getAuthentication();
//            User user = (User) auth.getPrincipal();
//
//            ModelAndView mv = new ModelAndView();
//            mv.addObject("name", "ljh");

            return lsUser;
        }else {
            return null;
        }
    }

    /**
     * 通过id获得实体
     * @param empId 工号
     * @return
     */
    @RequestMapping("/findOne")
    public Map<String,Object> findOne(String empId){
        Map<String,Object> map = new HashMap<>();
        Emp emp = empService.findOne(empId);
        if(emp.getSex().equals("A")){
            emp.setSex("男");
        }else {
            emp.setSex("女");
        }
        if(emp.getState().equals("F")){
            emp.setState("已离职");
        }else {
            emp.setState("在职");
        }
        if(wxcode == null){
            //生成随机的六位数字
            wxcode =  WXAppletUserInfo.wxcode(6);
            //生成绑定码后将对应的数据 先保存一部分到  绑定微信表中
            //防止 保存后 离开当前网页生成新的code 再进行保存   工号进行校验是否存在
            TbBindingWechat idtbBindingWechat = tbBindingWechatService.findByDgenumber(emp.getEmpId());
            //绑定表中没有该code数据  则进行添加相应的数据
            if(idtbBindingWechat == null){
                TbBindingWechat tbBindingWechat =  new TbBindingWechat();
                tbBindingWechat.setCode(wxcode);//* 初始化的必须参数
                //将工号作为id
                Long lId = new Long(emp.getEmpId());//*工号
                tbBindingWechat.setUserId(lId);
                tbBindingWechat.setUserName(emp.getName());
                tbBindingWechat.setStatus("0");//*绑定码有效性
                tbBindingWechat.setCreated(new Date());//*
                tbBindingWechat.setPhon(emp.getMobile());
                tbBindingWechat.setSex(emp.getSex());
                tbBindingWechat.setBirthday(emp.getBirthday());
                tbBindingWechat.setState(emp.getState());//任职状态
                tbBindingWechat.setDepartment(emp.getDeptId());
                //获得当前的登录管理员名称
                User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
                Emp emp1 = empService.findOne(user.getUsername());
                String username = null;
                if(emp1 != null){
                    username = emp1.getName();//获得操作用户的姓名
                }
                tbBindingWechat.setOperator("由"+user.getUsername()+"/"+username+"-进行绑定操作");
                // 需要切换当前线程的数据源  将部分数据 先插入绑定表中 后期使用
                tbBindingWechatService.add(tbBindingWechat);
            }else if((idtbBindingWechat.getCode() == null || "".equals(idtbBindingWechat.getCode())) && (idtbBindingWechat.getOpenId() ==null || "".equals(idtbBindingWechat.getOpenId()))){
                wxcode = WXAppletUserInfo.wxcode(6);//给离职后重新入职的员工  重新生成绑定码// 或者更换微信后 的解绑以前的工号  再次绑定
                idtbBindingWechat.setCode(wxcode);
                tbBindingWechatService.update(idtbBindingWechat);
            }
            else{
                wxcode = "该员工已经存在绑定码为："+idtbBindingWechat.getCode();
            }
        }
        map.put("data",emp);
        //生成随机六位数的绑定码
        map.put("wxcode", wxcode);
        wxcode =  null;
        return map;
    }
    //解除员工微信的绑定  解绑逻辑   清除 openID 绑定码  绑定码恢复可用状态
    @RequestMapping("/updateByEmpid")
    public Map<String,Object> updateByEmpid(String empid){
        Map<String,Object> map = new HashMap<>();
        TbBindingWechat byDgenumber = tbBindingWechatService.findByDgenumber(empid);
        if(byDgenumber != null && (byDgenumber.getOpenId() != null && !"".equals(byDgenumber.getOpenId()))){
            byDgenumber.setOpenId(null);
            byDgenumber.setCode(null);
            byDgenumber.setStatus("0");
            User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            Emp emp1 = empService.findOne(user.getUsername());
            String username = null;
            if(emp1 != null){
                username = emp1.getName();//获得操作用户的姓名
            }
            byDgenumber.setSpare2("由"+user.getUsername()+"/"+username+"-进行解绑操作");
            tbBindingWechatService.update(byDgenumber);
        }else {
           map.put("status",0);
        }
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

    //更新的部门id
    @RequestMapping("/updateEmpDeptId")
    public Result updateEmpDeptId(String empid,String deptid,HttpServletRequest request) throws Exception{
        Emp emp = new Emp();
        emp.setEmpId(empid);
        List<Emp> byEmp = empService.findByEmp(emp);
        if (byEmp != null) {
            emp= byEmp.get(0);
            String oringDeptid = emp.getDeptId();
            emp.setDeptId(deptid);
//            try {
                int i = empService.updateEmp(emp);
            HttpSession session = request.getSession();
                if(i>0){
//                    session.setAttribute("test","}由原始部门id改为");
//                    Object userNameob = request.getSession().getAttribute("userName");

                    session.setAttribute("modifier",emp.getName()+"["+emp.getEmpId()+"]由原始部门id="+oringDeptid+"改为部门id="+deptid);
                }
                return new Result(true,"修改成功");
//            }catch (Exception e){
//                return new Result(false,"修改失败");
//            }
        }else{
            return new Result(false,"修改失败");
        }
    }
    //更新
    @RequestMapping("/updateEmpState")
    public Result updateEmp(String empid,HttpServletRequest request) throws Exception{
        Emp emp = new Emp();
        emp.setEmpId(empid);
        List<Emp> byEmp = empService.findByEmp(emp);
        if (byEmp != null) {
            emp = byEmp.get(0);
            emp.setState("C");
            int i = empService.updateStateByempid(emp);
            if(i>0){
                    request.getSession().setAttribute("modifierState",emp.getName()+"["+emp.getEmpId()+"]的状态为离职未办手续");

            }
            return new Result(true,"修改成功");

        }else{
            return new Result(false,"修改失败");
        }




//            try {

//            }catch (Exception e){
//                return new Result(false,"修改失败");
//            }

    }
}
