package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.OrderMapper;
import com.qianfeng.pojo.Order;
import com.qianfeng.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public List<Order> findAllOrder() {
		// TODO Auto-generated method stub
		List<Order> list = orderMapper.findAllOders();
		
		
		return list;
	}

	@Override
	public void deleteOrder(Integer ordId) {
		// TODO Auto-generated method stub
		
		orderMapper.deleteByPrimaryKey(ordId);
		
	}

	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		
		orderMapper.insertSelective(order);
		
	}

	@Override
	public Order findOrderById(Integer OrdId) {
		// TODO Auto-generated method stub
		
		Order order = orderMapper.selectByPrimaryKey(OrdId);
		return order;
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		
		orderMapper.updateByPrimaryKeySelective(order);
		
		
	}

	@Override
	public List<Order> findOrder(Order order) {
		// TODO Auto-generated method stub
		
		List<Order> list = orderMapper.findOrder(order);
		return list;
	}

}
