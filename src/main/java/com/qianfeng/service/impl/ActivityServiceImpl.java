package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.ActivityMapper;
import com.qianfeng.pojo.Activity;
import com.qianfeng.service.ActivityService;
@Service
public class ActivityServiceImpl implements ActivityService{

	
	@Autowired
	private ActivityMapper activityMapper;
	
	@Override
	public List<Activity> findActByCustNo(String custNo) {
		// TODO Auto-generated method stub
		List<Activity> list = activityMapper.findByCustNo(custNo);
		return list;
	}

	@Override
	public void deleteActById(Integer id) {
		// TODO Auto-generated method stub
		activityMapper.deleteByPrimaryKey(id);
		
	}

}
