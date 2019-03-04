package com.qianfeng.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Notice {
    private Integer notId;

    private Integer notUserId;

    private String notParam;

    private Date notCreatedate;

    private Byte notFlag;

    public Integer getNotId() {
        return notId;
    }

    public void setNotId(Integer notId) {
        this.notId = notId;
    }

    public Integer getNotUserId() {
        return notUserId;
    }

    public void setNotUserId(Integer notUserId) {
        this.notUserId = notUserId;
    }

    public String getNotParam() {
        return notParam;
    }

    public void setNotParam(String notParam) {
        this.notParam = notParam == null ? null : notParam.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    public Date getNotCreatedate() {
        return notCreatedate;
    }

    public void setNotCreatedate(Date notCreatedate) {
        this.notCreatedate = notCreatedate;
    }

    public Byte getNotFlag() {
        return notFlag;
    }

    public void setNotFlag(Byte notFlag) {
        this.notFlag = notFlag;
    }
}