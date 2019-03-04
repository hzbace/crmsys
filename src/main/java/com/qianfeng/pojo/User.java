package com.qianfeng.pojo;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private Integer userRoleId;

    private Byte userFlag;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Byte getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(Byte userFlag) {
        this.userFlag = userFlag;
    }
}