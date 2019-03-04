package com.qianfeng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.pojo.Ordersline;
import com.qianfeng.service.OrderLineService;
import com.qianfeng.vo.JsonBean;
import com.qianfeng.vo.OrderLine;

@Controller
public class OrderLineController {
	
	@Autowired
	private OrderLineService orderLineService;
	
	@RequestMapping("/OrderLineList.do")
	@ResponseBody
	public JsonBean findAllOrderLine() {
		
		JsonBean bean = new JsonBean();
		try {
			List<OrderLine> list = orderLineService.findAllOrderLine();
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
	
	@RequestMapping("/removeOrdersLine.do")
	@ResponseBody
	public JsonBean delete(Integer id) {
		JsonBean bean = new JsonBean();
		
		try {
			orderLineService.deleteById(id);
			bean.setCode(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		
		return bean;
	}
	
	
	@RequestMapping("/saveOrdersLine.do")
	@ResponseBody
	public JsonBean add(Ordersline ordersline) {
		JsonBean bean = new JsonBean();
		
		try {
			orderLineService.addOrderLine(ordersline);
			bean.setCode(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		
		return bean;
	}
	
	
	@RequestMapping("/findOrderline.do")
	@ResponseBody
	public JsonBean findById(Integer oddId) {
		JsonBean bean = new JsonBean();
		
		try {
			Ordersline ordersline = orderLineService.findById(oddId);
			bean.setCode(1);
			bean.setInfo(ordersline);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		
		return bean;
	}
	
	
	@RequestMapping("/updateOrderline.do")
	@ResponseBody
	public JsonBean update(Ordersline ordersline) {
		JsonBean bean = new JsonBean();
		
		try {
			orderLineService.update(ordersline);
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







