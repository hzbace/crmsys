package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.LinkmanMapper;
import com.qianfeng.pojo.Linkman;
import com.qianfeng.service.LinkmanService;
@Service
public class LinkmanServiceImpl implements LinkmanService{

	@Autowired
	private LinkmanMapper linkmanMapper;
	
	@Override
	public Linkman findByNo(String custNo) {
		// TODO Auto-generated method stub
		Linkman linkman = linkmanMapper.findByCustNo(custNo);
		
		return linkman;
	}

	@Override
	public void deleteByCustNo(String custNo) {
		// TODO Auto-generated method stub
		linkmanMapper.deleteByCustNo(custNo);
	}

}
