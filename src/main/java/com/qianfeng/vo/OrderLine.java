package com.qianfeng.vo;

import com.qianfeng.pojo.Order;
import com.qianfeng.pojo.Product;

public class OrderLine {
	private Integer olId;
	private Order order;
	private Product product;
	private Integer olCount;
	private String olUnit;
	public Integer getOlId() {
		return olId;
	}
	public void setOlId(Integer olId) {
		this.olId = olId;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getOlCount() {
		return olCount;
	}
	public void setOlCount(Integer olCount) {
		this.olCount = olCount;
	}
	public String getOlUnit() {
		return olUnit;
	}
	public void setOlUnit(String olUnit) {
		this.olUnit = olUnit;
	}
	@Override
	public String toString() {
		return "OrderLine [olId=" + olId + ", order=" + order + ", product=" + product + ", olCount=" + olCount
				+ ", olUnit=" + olUnit + "]";
	}
	
	
	
}
