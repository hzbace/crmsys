package com.qianfeng.vo;

import java.util.List;

import com.qianfeng.pojo.Right;

public class RRole {

	private Integer roleId;
	private String roleName;
	private String roleDesc;
	private String roleFlag;
	private List<Right> rights;
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public String getRoleFlag() {
		return roleFlag;
	}
	public void setRoleFlag(String roleFlag) {
		this.roleFlag = roleFlag;
	}
	public List<Right> getRights() {
		return rights;
	}
	public void setRights(List<Right> rights) {
		this.rights = rights;
	}
	
	
}
