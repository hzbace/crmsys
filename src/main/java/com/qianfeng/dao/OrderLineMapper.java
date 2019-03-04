package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.vo.OrderLine;

public interface OrderLineMapper {

	public List<OrderLine> findAllOrderLine();
}
