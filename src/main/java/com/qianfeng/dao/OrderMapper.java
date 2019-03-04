package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer odrId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer odrId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    public List<Order> findAllOders();
    
    public List<Order> findOrder(Order record);
    
    
}