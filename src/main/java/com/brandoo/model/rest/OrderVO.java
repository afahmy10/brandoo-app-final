package com.brandoo.model.rest;

import java.util.List;

import javax.persistence.Entity;

public class OrderVO {
	  Integer id;
	  String clientName;
	  Double totalPrice;
	  String clientAddress;
	  String phone;
	  int orderStatusId;
	  String orderStatusName;
	  Double discount;
	  String remarks;
	  Double shipmentFees;
	  List<OrderItemVO> orderItems;
	  public OrderVO(int id, String clientName, Double totalPrice, String clientAddress, String phone, int orderStatusId,
			String orderStatusName, Double discount, String remarks, Double shipmentFees, Integer shipmentCompany) {
		super();
		this.id = id;
		this.clientName = clientName;
		this.totalPrice = totalPrice;
		this.clientAddress = clientAddress;
		this.phone = phone;
		this.orderStatusId = orderStatusId;
		this.orderStatusName = orderStatusName;
		this.discount = discount;
		this.remarks = remarks;
		this.shipmentFees = shipmentFees;
		this.shipmentCompany = shipmentCompany;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getOrderStatusId() {
		return orderStatusId;
	}
	public void setOrderStatusId(int orderStatusId) {
		this.orderStatusId = orderStatusId;
	}
	public String getOrderStatusName() {
		return orderStatusName;
	}
	public void setOrderStatusName(String orderStatusName) {
		this.orderStatusName = orderStatusName;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Double getShipmentFees() {
		return shipmentFees;
	}
	public void setShipmentFees(Double shipmentFees) {
		this.shipmentFees = shipmentFees;
	}
	public List<OrderItemVO> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItemVO> orderItems) {
		this.orderItems = orderItems;
	}
	public int getShipmentCompany() {
		return shipmentCompany;
	}
	public void setShipmentCompany(int shipmentCompany) {
		this.shipmentCompany = shipmentCompany;
	}
	int shipmentCompany;

}
