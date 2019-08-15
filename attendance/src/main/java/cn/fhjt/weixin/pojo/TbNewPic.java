package cn.fhjt.weixin.pojo;

import java.io.Serializable;

public class TbNewPic implements Serializable {
    private Long id;

    private Long newId;

    private String picUrl;

    private String spare0;

    private String spare1;

    private String spare3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNewId() {
        return newId;
    }

    public void setNewId(Long newId) {
        this.newId = newId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getSpare0() {
        return spare0;
    }

    public void setSpare0(String spare0) {
        this.spare0 = spare0 == null ? null : spare0.trim();
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1 == null ? null : spare1.trim();
    }

    public String getSpare3() {
        return spare3;
    }

    public void setSpare3(String spare3) {
        this.spare3 = spare3 == null ? null : spare3.trim();
    }
}