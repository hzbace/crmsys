package com.qianfeng.vo;

public class VUser {
	private Integer userId;
	private String userName;
	private String userPassword;
	private String roleName;
	private Integer userFlag;
	
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
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String userRole) {
		this.roleName = userRole;
	}
	public Integer getUserFlag() {
		return userFlag;
	}
	public void setUserFlag(Integer userFlag) {
		this.userFlag = userFlag;
	}
	@Override
	public String toString() {
		return "VUser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", roleName="
				+ roleName + ", userFlag=" + userFlag + "]";
	}
	
	
}
