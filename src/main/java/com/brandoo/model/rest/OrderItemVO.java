package com.brandoo.model.rest;

import com.google.common.primitives.Bytes;

public class OrderItemVO {
	  Integer id;
	  String name;
	  Double originalPrice;
	  Double sellingPrice;
	  Integer quantity;

	  Byte itemImage [];

	public Integer getId() {
		return id;
	}

	public OrderItemVO(Integer id,Byte [] itemImage, String name, Double originalPrice, Double sellingPrice, Integer quantity,
			Bytes[] bytes) {
		super();
		this.id = id;
		this.name = name;
		this.originalPrice = originalPrice;
		this.sellingPrice = sellingPrice;
		this.quantity = quantity;
		this.itemImage = itemImage;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Byte [] getItemImage() {
		return itemImage;
	}

	public void setItemImage(Byte[] itemImage) {
		this.itemImage = itemImage;
	}


}
