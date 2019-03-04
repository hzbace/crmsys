package com.qianfeng.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Activity {
    private Integer atvId;

    private String atvCustNo;

    private Date atvDate;

    private String atvPlace;

    private String atvTitle;

    private String atvDesc;

    private Byte atvFlag;

    public Integer getAtvId() {
        return atvId;
    }

    public void setAtvId(Integer atvId) {
        this.atvId = atvId;
    }

    public String getAtvCustNo() {
        return atvCustNo;
    }

    public void setAtvCustNo(String atvCustNo) {
        this.atvCustNo = atvCustNo == null ? null : atvCustNo.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    public Date getAtvDate() {
        return atvDate;
    }

    public void setAtvDate(Date atvDate) {
        this.atvDate = atvDate;
    }

    public String getAtvPlace() {
        return atvPlace;
    }

    public void setAtvPlace(String atvPlace) {
        this.atvPlace = atvPlace == null ? null : atvPlace.trim();
    }

    public String getAtvTitle() {
        return atvTitle;
    }

    public void setAtvTitle(String atvTitle) {
        this.atvTitle = atvTitle == null ? null : atvTitle.trim();
    }

    public String getAtvDesc() {
        return atvDesc;
    }

    public void setAtvDesc(String atvDesc) {
        this.atvDesc = atvDesc == null ? null : atvDesc.trim();
    }

    public Byte getAtvFlag() {
        return atvFlag;
    }

    public void setAtvFlag(Byte atvFlag) {
        this.atvFlag = atvFlag;
    }
}