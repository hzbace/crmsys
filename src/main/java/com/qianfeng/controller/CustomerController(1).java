package com.qianfeng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.pojo.Customer;
import com.qianfeng.service.CustomerService;
import com.qianfeng.service.LinkmanService;
import com.qianfeng.vo.JsonBean;
import com.qianfeng.vo.VCustomer;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private LinkmanService linkmanService;
	
	@RequestMapping("/customerList")
	@ResponseBody
	public JsonBean findAll() {
		JsonBean bean = new JsonBean();
		
		try {
			List<Customer> list = customerService.findAll();
			bean.setCode(1);
			bean.setInfo(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		return bean;
		
	}
	
	@RequestMapping("/customerList2.do")
	@ResponseBody
	public JsonBean findAll2() {
		JsonBean bean = new JsonBean();
		
		try {
			List<VCustomer> list = customerService.findAll2();
			bean.setCode(1);
			bean.setInfo(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		return bean;
		
	}
	
	@RequestMapping("/deleteCustomer.do")
	@ResponseBody
	public JsonBean delete(String custNo) {
		JsonBean bean = new JsonBean();
		
		try {
			//customerService.deleteByCustNo(custNo);
			linkmanService.deleteByCustNo(custNo);
			bean.setCode(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		return bean;
	}
	
	
	
	
}
