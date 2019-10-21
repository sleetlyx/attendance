package cn.fhjt.weixin.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.util.StringUtils;

/**
 * 部门表实体对象
 */
public class AppDept {

// [company_id]//            ,[dept_id]
//            ,[dept_name]
//            ,[order_id]
//            ,[parent_dept_id]
//            ,[stop_flag]
//@JSONField(serialize=false)
//private  String companyId;
//    {id:1, pId:0, name:"北京"},
//    private  String deptId;
    private  String id;
    //    private  String parentDeptId;
        private  String pId;
//    private  String deptName;
    private  String name;
//    @JSONField(serialize=false)
//    private String orderId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
