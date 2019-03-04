package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.ProductMapper;
import com.qianfeng.pojo.Product;
import com.qianfeng.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductMapper productMapper;
	
	
	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		
		
		List<Product> list = productMapper.findAllProduct();
		
		return list;
	}


	@Override
	public Product findProduct(Product p) {
		// TODO Auto-generated method stub
		Product product = productMapper.findProduct(p);
		return product;
	}


	@Override
	public void add(Product p) {
		// TODO Auto-generated method stub
		productMapper.insert(p);
		
	}


	@Override
	public void deleteById(Integer prodId) {

		productMapper.deleteByPrimaryKey(prodId);
	}


	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		productMapper.updateByPrimaryKeySelective(p);
	}


	@Override
	public Product findProductById(Integer prodId) {
		// TODO Auto-generated method stub
		Product product = productMapper.selectByPrimaryKey(prodId);
		
		return product;
	}

}
