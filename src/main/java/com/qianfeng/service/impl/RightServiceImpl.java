package com.qianfeng.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qianfeng.dao.RightMapper;
import com.qianfeng.pojo.Right;
import com.qianfeng.service.RightService;
@Service
public class RightServiceImpl implements RightService{

	
	@Autowired
	private RightMapper rightMapper;
	
	
	@Override
	public List<Right> findAllRight() {
		// TODO Auto-generated method stub
		List<Right> list = rightMapper.findAllRight();
		return list;
	}


	@Override
	public Map<String, Object> findRightByPage(Integer page, Integer pageSize) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		
		Page<Object> pageInfo = PageHelper.startPage(page, pageSize);
		List<Right> list = rightMapper.findAllRight();
		
		System.out.println(pageInfo.getTotal());
		map.put("total", pageInfo.getTotal());
		map.put("list", list);
		
		return map;
	}


	@Override
	public void deleteRight(Integer id) {
		// TODO Auto-generated method stub
		rightMapper.deleteRight(id);
	}

}
