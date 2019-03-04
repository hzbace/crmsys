package com.qianfeng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.pojo.Product;
import com.qianfeng.service.ProductService;
import com.qianfeng.vo.JsonBean;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@RequestMapping("/productlist.do")
	@ResponseBody
	public JsonBean findAllProduct() {
		JsonBean  bean = new JsonBean();
		
		try {
			List<Product> list = productService.findAllProduct();
			bean.setCode(1);
			bean.setInfo(list);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		return bean;
	}
	
	@RequestMapping("/findProduct.do")
	@ResponseBody
	public JsonBean findProduct(String prodName, String prodType, String prodBatch) {
		JsonBean bean = new JsonBean();
		
		if(prodBatch.equals("") && prodName.equals("") && prodType.equals("")) {
			bean.setCode(0);
			bean.setInfo("至少输入一条有效信息");
		}
		
		
		
		Product p = new Product();
		if(!prodName.equals("")) {
			p.setProdName(prodName);
		}else if(!prodType.equals("")) {
			p.setProdType(prodType);
		}else if(!prodBatch.equals("")) {
			p.setProdBatch(prodBatch);
		}
		
		System.out.println(p);
		
		try {
			Product pd = productService.findProduct(p);
			bean.setCode(1);
			bean.setInfo(pd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo("至少输入一条有效信息");
		}
		
	
		return bean;
	
	}
	
	@RequestMapping("/saveproduct.do")
	@ResponseBody
	public JsonBean addProduct(Product p) {
		JsonBean bean = new JsonBean();
		
		try {
			productService.add(p);
			bean.setCode(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		return bean;
	}
	
	
	
	@RequestMapping("/deleteproduct.do")
	@ResponseBody
	public JsonBean removeProduct(Integer id) {
		JsonBean bean = new JsonBean();
		
		try {
			productService.deleteById(id);
			 bean.setCode(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		return bean;
	}
	
	
	@RequestMapping("/updateproduct.do")
	@ResponseBody
	public JsonBean updateProduct(Product p) {
		JsonBean bean = new JsonBean();
		try {
			productService.updateProduct(p);
			bean.setCode(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
		}
		
		
		return bean;
	}
	
	@RequestMapping("/findproduct.do")
	@ResponseBody
	public JsonBean findProduct(Integer id) {
		JsonBean bean = new JsonBean();
		
		try {
			Product p = productService.findProductById(id);
			bean.setCode(1);
			bean.setInfo(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean.setCode(0);
			bean.setInfo(e.getMessage());
		}
		
		return bean;
	}
	
	
	
	
	
	
}
