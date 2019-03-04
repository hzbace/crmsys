package com.qianfeng.test;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qianfeng.pojo.Product;
import com.qianfeng.service.ProductService;

public class ProductServiceTest extends BaseTest{

	@Autowired
	private ProductService productService;
	
	@Test
	public void test() {
		
		Product p = new Product();
		p.setProdType("小飞侠");
		Product product = productService.findProduct(p);
		System.out.println(product);
	}
}
