package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Customer;
import com.qianfeng.vo.VCustomer;

public interface CustomerMapper {
    int insert(Customer record);

    int insertSelective(Customer record);
    
    public List<Customer> findAll();
    
    public List<VCustomer> findAll2();
    
    public void deleteByCustNo(String custNo);
}