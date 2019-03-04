package com.qianfeng.dao;

import com.qianfeng.pojo.Ordersline;

public interface OrderslineMapper {
    int deleteByPrimaryKey(Integer oddId);

    int insert(Ordersline record);

    int insertSelective(Ordersline record);

    Ordersline selectByPrimaryKey(Integer oddId);

    int updateByPrimaryKeySelective(Ordersline record);

    int updateByPrimaryKey(Ordersline record);
}