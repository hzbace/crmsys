package com.qianfeng.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qianfeng.service.OrderLineService;
import com.qianfeng.vo.OrderLine;

public class OrderLineTest extends BaseTest{

	@Autowired
	private OrderLineService orderLineService;
	
	@Test
	public void test() {
		List<OrderLine> list = orderLineService.findAllOrderLine();
		for (OrderLine orderLine : list) {
			System.out.println(orderLine);
		}
	}
}
