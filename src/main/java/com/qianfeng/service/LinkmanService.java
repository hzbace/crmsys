package com.qianfeng.service;

import com.qianfeng.pojo.Linkman;

public interface LinkmanService {

	public Linkman findByNo(String custNo);
	
	public void deleteByCustNo(String custNo);
}
