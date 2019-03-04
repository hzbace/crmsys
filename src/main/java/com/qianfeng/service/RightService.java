package com.qianfeng.service;

import java.util.List;
import java.util.Map;

import com.qianfeng.pojo.Right;

public interface RightService {

	public List<Right> findAllRight();
	
	public Map<String, Object> findRightByPage(Integer page, Integer pageSize);
	
	public void deleteRight(Integer id);
}
