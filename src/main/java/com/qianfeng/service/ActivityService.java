package com.qianfeng.service;

import java.util.List;

import com.qianfeng.pojo.Activity;

public interface ActivityService {

	public List<Activity> findActByCustNo(String custNo);
	
	public void deleteActById(Integer id);
}
