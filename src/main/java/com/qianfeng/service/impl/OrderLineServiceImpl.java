package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.OrderLineMapper;
import com.qianfeng.dao.OrderslineMapper;
import com.qianfeng.pojo.Ordersline;
import com.qianfeng.service.OrderLineService;
import com.qianfeng.vo.OrderLine;

@Service
public class OrderLineServiceImpl implements OrderLineService{

	@Autowired
	private OrderLineMapper orderLineMapper;
	
	@Autowired
	private OrderslineMapper orderslineMapper;
	
	@Override
	public List<OrderLine> findAllOrderLine() {
		// TODO Auto-generated method stub
		List<OrderLine> list = orderLineMapper.findAllOrderLine();
		return list;
	}

	@Override
	public void deleteById(Integer oddId) {
		// TODO Auto-generated method stub
		orderslineMapper.deleteByPrimaryKey(oddId);
	}

	@Override
	public void addOrderLine(Ordersline ordersline) {
		// TODO Auto-generated method stub
		orderslineMapper.insertSelective(ordersline);
	}

	@Override
	public Ordersline findById(Integer oddId) {

		return orderslineMapper.selectByPrimaryKey(oddId);
	}

	@Override
	public void update(Ordersline ordersline) {
		// TODO Auto-generated method stub
		
		orderslineMapper.updateByPrimaryKeySelective(ordersline);
		
	}

}
