package com.qianfeng.dao;

import java.util.List;

import com.qianfeng.pojo.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer prodId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer prodId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    
    public List<Product> findAllProduct();
    
    public Product findProduct(Product product);
}