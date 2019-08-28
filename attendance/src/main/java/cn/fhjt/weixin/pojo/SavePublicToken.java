package cn.fhjt.weixin.pojo;

import java.io.Serializable;

public class SavePublicToken implements Serializable {
    private Long id;

    private String publicToken;

    private String spare0;

    private String spare1;

    private String spare2;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublicToken() {
        return publicToken;
    }

    public void setPublicToken(String publicToken) {
        this.publicToken = publicToken;
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1;
    }

    public String getSpare2() {
        return spare2;
    }

    public void setSpare2(String spare2) {
        this.spare2 = spare2;
    }

    public String getSpare0() {
        return spare0;
    }

    public void setSpare0(String spare0) {
        this.spare0 = spare0;
    }
}
