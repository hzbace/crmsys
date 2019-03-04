package com.qianfeng.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.pojo.Order;
import com.qianfeng.service.OrderService;
import com.qianfeng.vo.JsonBean;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	
	@RequestMapping("/orderlist.do")
	@ResponseBody
	public JsonBean findAllOrder() {
		
		JsonBean bean = new JsonBean();
		try {
			List<Order> list = orderService.findAllOrder();
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
	
	

	@RequestMapping("/deleteorder.do")
	@ResponseBody
	public JsonBean remove(Integer id) {
		
		JsonBean bean = new JsonBean();
		try {
			orderService.deleteOrder(id);
			bean.setCode(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		
		return bean;
	}
	
	
	@RequestMapping("/saveorder.do")
	@ResponseBody
	public JsonBean addOrder(Order order) {
		
		JsonBean bean = new JsonBean();
		
		try {
			orderService.addOrder(order);
			bean.setCode(1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		
		return bean;
	}
	
	@InitBinder
	public void initBind(WebDataBinder binder) {
		//注册自定义的转换器
		//本例将指定格式的日期字符串转为日期对象
		binder.registerCustomEditor(Date.class,
				new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
	}
	
	
	
	@RequestMapping("/findOrder.do")
	@ResponseBody
	public JsonBean findOrder(Integer odrId) {
		
		JsonBean bean = new JsonBean();
		
		try {
			Order order = orderService.findOrderById(odrId);
			bean.setCode(1);
			bean.setInfo(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		return bean;
	}
	
	
	@RequestMapping("/updateOrder.do")
	@ResponseBody
	public JsonBean updateOrder(Order order) {
		
		JsonBean bean = new JsonBean();
		
		try {
			orderService.updateOrder(order);
			bean.setCode(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		return bean;
	}
	
	
	
	@RequestMapping("/findOrders.do")
	@ResponseBody
	public JsonBean findOrders(String odrCustomerNo, String odrStatus) {
		
		System.out.println(odrCustomerNo);
		
		JsonBean bean = new JsonBean();
		
		Order order = new Order();
		
		if (!odrCustomerNo.equals("")) {
			order.setOdrCustomerNo(odrCustomerNo);
		}else if(!odrStatus.equals("")) {
			order.setOdrStatus(odrStatus);
		}
		
		try {
			List<Order> list = orderService.findOrder(order);
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
	
}
