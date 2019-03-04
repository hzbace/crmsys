package com.qianfeng.service;

import java.util.List;

import com.qianfeng.pojo.Order;

public interface OrderService {

	public List<Order> findAllOrder();
	
	public void deleteOrder(Integer ordId);
	
	public void addOrder(Order order);
	
	public Order findOrderById(Integer OrdId);
	
	public void updateOrder(Order order);
	
	public List<Order> findOrder(Order order);
}
