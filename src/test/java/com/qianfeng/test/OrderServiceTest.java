package com.qianfeng.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qianfeng.pojo.Order;
import com.qianfeng.service.OrderService;

public class OrderServiceTest extends BaseTest{

	
	@Autowired
	private OrderService orderService;
	
	@Test
	public void test1() {
		List<Order> list = orderService.findAllOrder();
		for (Order order : list) {
			System.out.println(order);
		}
	}
	
	
}
