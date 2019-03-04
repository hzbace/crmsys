package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.CustomerMapper;
import com.qianfeng.pojo.Customer;
import com.qianfeng.service.CustomerService;
import com.qianfeng.vo.VCustomer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerMapper customerMapper;
	
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		List<Customer> list = customerMapper.findAll();
			
		return list;
	}


	@Override
	public List<VCustomer> findAll2() {
		// TODO Auto-generated method stub
		List<VCustomer> list = customerMapper.findAll2();
		return list;
	}


	@Override
	public void deleteByCustNo(String custNo) {
		// TODO Auto-generated method stub
		customerMapper.deleteByCustNo(custNo);
	}

}
