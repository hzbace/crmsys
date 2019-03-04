package com.qianfeng.pojo;

public class Product {
    private Integer prodId;

    private String prodName;

    private String prodType;

    private String prodBatch;

    private String prodUnit;

    private Integer prodPrice;

    private String prodMemo;

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType == null ? null : prodType.trim();
    }

    public String getProdBatch() {
        return prodBatch;
    }

    public void setProdBatch(String prodBatch) {
        this.prodBatch = prodBatch == null ? null : prodBatch.trim();
    }

    public String getProdUnit() {
        return prodUnit;
    }

    public void setProdUnit(String prodUnit) {
        this.prodUnit = prodUnit == null ? null : prodUnit.trim();
    }

    public Integer getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Integer prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdMemo() {
        return prodMemo;
    }

    public void setProdMemo(String prodMemo) {
        this.prodMemo = prodMemo == null ? null : prodMemo.trim();
    }

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodType=" + prodType + ", prodBatch="
				+ prodBatch + ", prodUnit=" + prodUnit + ", prodPrice=" + prodPrice + ", prodMemo=" + prodMemo + "]";
	}
    
}