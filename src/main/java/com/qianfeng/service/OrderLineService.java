package com.qianfeng.service;

import java.util.List;

import com.qianfeng.pojo.Ordersline;
import com.qianfeng.vo.OrderLine;

public interface OrderLineService {

	
	public List<OrderLine> findAllOrderLine();
	
	public void deleteById(Integer oddId);
	
	public void addOrderLine(Ordersline ordersline);
	
	public Ordersline findById(Integer oddId);
	
	public void update(Ordersline ordersline);
}
