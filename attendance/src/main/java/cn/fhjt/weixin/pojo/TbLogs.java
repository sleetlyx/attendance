package cn.fhjt.weixin.pojo;

import java.util.Date;

public class TbLogs {
    private Long id;

    private String operator;

    private String operationInterface;

    private String cIp;

    private String executiveBusiness;

    private String successFlag;

    private String timeConsuming;

    private Date creationTime;

    private String spare1;

    private String spare2;

    private String spare3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getOperationInterface() {
        return operationInterface;
    }

    public void setOperationInterface(String operationInterface) {
        this.operationInterface = operationInterface == null ? null : operationInterface.trim();
    }

    public String getcIp() {
        return cIp;
    }

    public void setcIp(String cIp) {
        this.cIp = cIp == null ? null : cIp.trim();
    }

    public String getExecutiveBusiness() {
        return executiveBusiness;
    }

    public void setExecutiveBusiness(String executiveBusiness) {
        this.executiveBusiness = executiveBusiness == null ? null : executiveBusiness.trim();
    }

    public String getSuccessFlag() {
        return successFlag;
    }

    public void setSuccessFlag(String successFlag) {
        this.successFlag = successFlag == null ? null : successFlag.trim();
    }

    public String getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(String timeConsuming) {
        this.timeConsuming = timeConsuming == null ? null : timeConsuming.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1 == null ? null : spare1.trim();
    }

    public String getSpare2() {
        return spare2;
    }

    public void setSpare2(String spare2) {
        this.spare2 = spare2 == null ? null : spare2.trim();
    }

    public String getSpare3() {
        return spare3;
    }

    public void setSpare3(String spare3) {
        this.spare3 = spare3 == null ? null : spare3.trim();
    }
}