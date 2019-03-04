package com.qianfeng.service;

import java.util.List;

import com.qianfeng.pojo.Product;

public interface ProductService {

	public List<Product> findAllProduct();
	
	public Product findProduct(Product p);
	
	public void add(Product p);
	
	public void deleteById(Integer prodId);
	
	public void updateProduct(Product p);
	
	public Product findProductById(Integer prodId);
}
