package cn.fhjt.weixin.controller;

import cn.fhjt.weixin.pojo.AppDept;
import cn.fhjt.weixin.pojo.entity.Result;
import cn.fhjt.weixin.service.AppDeptService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/empManger")
public class EmpMangerController {
@Autowired
    private AppDeptService appDeptService;

    @RequestMapping("findAll")
    public  @ResponseBody
    List<AppDept> findAll(){

      List<AppDept>appDeptList = appDeptService.findAllDepe();
      //  {id:1, pId:0, name:"北京"},
//        {id:4, pId:0, name:"河北省", open:true},
//        {id:41, pId:4, name:"石家庄"},
//{"deptId": "1299","deptName": "外派（兽医站）","parentDeptId": "1200"
//}
        return  appDeptList;
    }
    @RequestMapping("/zThree")
    public  String  zthree(){

        return "three";

    }


}
