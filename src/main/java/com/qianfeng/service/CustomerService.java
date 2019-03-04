package com.qianfeng.service;

import java.util.List;

import com.qianfeng.pojo.Customer;
import com.qianfeng.vo.VCustomer;

public interface CustomerService {

	public List<Customer> findAll();
	
	
	public List<VCustomer> findAll2();
	
	public void deleteByCustNo(String custNo);
}
