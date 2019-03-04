package com.qianfeng.vo;

import java.util.List;

import com.qianfeng.pojo.Right;

public class MenuInfo {

	private Integer id;
	private String pMenuName;
	
	private List<Right> cMenuList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getpMenuName() {
		return pMenuName;
	}

	public void setpMenuName(String pMenuName) {
		this.pMenuName = pMenuName;
	}

	public List<Right> getcMenuList() {
		return cMenuList;
	}

	public void setcMenuList(List<Right> cMenuList) {
		this.cMenuList = cMenuList;
	}
	
	
}
