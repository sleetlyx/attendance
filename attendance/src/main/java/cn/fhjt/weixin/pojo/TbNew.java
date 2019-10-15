package cn.fhjt.weixin.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TbNew implements Serializable {
    private Long id;

    private String content;

    private Long newPicId;

    private String type;

    private Date newTime;

    private String titile;

    private String spare0;//存放新闻图片地址

    private String spare1;

    private String spare2;

    private String spare3;

    private List<TbNewPic> listNewPice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getNewPicId() {
        return newPicId;
    }

    public void setNewPicId(Long newPicId) {
        this.newPicId = newPicId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getNewTime() {
        return newTime;
    }

    public void setNewTime(Date newTime) {
        this.newTime = newTime;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile == null ? null : titile.trim();
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


    public List<TbNewPic> getListNewPice() {
        return listNewPice;
    }

    public void setListNewPice(List<TbNewPic> listNewPice) {
        this.listNewPice = listNewPice;
    }
}