package com.qianfeng.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Order {
    private Integer odrId;

    private String odrCustomerNo;

    private Date odrDate;

    private String odrAddr;

    private String odrStatus;

    public Integer getOdrId() {
        return odrId;
    }

    public void setOdrId(Integer odrId) {
        this.odrId = odrId;
    }

    public String getOdrCustomerNo() {
        return odrCustomerNo;
    }

    public void setOdrCustomerNo(String odrCustomerNo) {
        this.odrCustomerNo = odrCustomerNo == null ? null : odrCustomerNo.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:hh:ss",timezone="GMT+8")
    public Date getOdrDate() {
        return odrDate;
    }

//    @JsonFormat(pattern="yyyy-MM-dd HH:hh:ss",timezone="GMT+8")
    public void setOdrDate(Date odrDate) {
        this.odrDate = odrDate;
    }

    public String getOdrAddr() {
        return odrAddr;
    }

    public void setOdrAddr(String odrAddr) {
        this.odrAddr = odrAddr == null ? null : odrAddr.trim();
    }

    public String getOdrStatus() {
        return odrStatus;
    }

    public void setOdrStatus(String odrStatus) {
        this.odrStatus = odrStatus == null ? null : odrStatus.trim();
    }

	@Override
	public String toString() {
		return "Order [odrId=" + odrId + ", odrCustomerNo=" + odrCustomerNo + ", odrDate=" + odrDate + ", odrAddr="
				+ odrAddr + ", odrStatus=" + odrStatus + "]";
	}
    
    
}