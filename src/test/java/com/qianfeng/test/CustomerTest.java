package com.qianfeng.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qianfeng.dao.CustomerMapper;
import com.qianfeng.vo.VCustomer;

public class CustomerTest extends BaseTest{

	@Autowired
	private CustomerMapper customerMapper;
	
	@Test
	public void test() {
		List<VCustomer> list = customerMapper.findAll2();
		for (VCustomer vCustomer : list) {
			System.out.println(vCustomer);
		}
	}
}
