package com.brandoo.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the Orders database table.
 * 
 */
@Entity
@Table(name="Orders")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="client_address")
	private String clientAddress;

	public Order(Integer id, String clientAddress, String clientName, BigDecimal discount, String phone, String remarks,
			Integer shipmentCompany, BigDecimal shipmentFees, BigDecimal totalPrice, OrderStatus orderStatus,
			List<OrderItem> orderItems, Integer orderStatusId, String orderStatusName) {
		super();
		this.id = id;
		this.clientAddress = clientAddress;
		this.clientName = clientName;
		this.discount = discount;
		this.phone = phone;
		this.remarks = remarks;
		this.shipmentCompany = shipmentCompany;
		this.shipmentFees = shipmentFees;
		this.totalPrice = totalPrice;
		this.orderStatus = orderStatus;
		this.orderItems = orderItems;
		this.orderStatusId = orderStatusId;
		this.orderStatusName = orderStatusName;
	}

	@Column(name="client_name")
	private String clientName;

	private BigDecimal discount;

	private String phone;

	private String remarks;

	@Column(name="shipment_company")
	private Integer shipmentCompany;

	@Column(name="shipment_fees")
	private BigDecimal shipmentFees;

	@Column(name="total_price")
	private BigDecimal totalPrice;

	@Column(name="city")

	private String city;
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//uni-directional many-to-one association to OrderStatus
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="order_status_id")
	//@JsonIgnore
	private OrderStatus orderStatus;

	//bi-directional many-to-one association to OrderItem
	@OneToMany(mappedBy="order" ,fetch = FetchType.EAGER,  cascade = CascadeType.ALL,orphanRemoval = true)
	@JsonManagedReference
	private List<OrderItem> orderItems;
	@JsonInclude()
	@Transient
    private Integer orderStatusId;
	@JsonInclude()
	@Transient
    private String orderStatusName;
    
	public Integer getOrderStatusId() {
		return orderStatusId;
	}

	public void setOrderStatusId(Integer orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public String getOrderStatusName() {
		return orderStatusName;
	}

	public void setOrderStatusName(String orderStatusName) {
		this.orderStatusName = orderStatusName;
	}

	public Order() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClientAddress() {
		return this.clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getShipmentCompany() {
		return this.shipmentCompany;
	}

	public void setShipmentCompany(Integer shipmentCompany) {
		this.shipmentCompany = shipmentCompany;
	}

	public BigDecimal getShipmentFees() {
		return this.shipmentFees;
	}

	public void setShipmentFees(BigDecimal shipmentFees) {
		this.shipmentFees = shipmentFees;
	}

	public BigDecimal getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}


	public OrderStatus getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		System.out.println("inside order status ");
		this.orderStatus = orderStatus;
		/*if(this.getOrderStatus()!=null) {
        		this.setOrderStatusId(this.getOrderStatus().getId());
        		this.setOrderStatusName(this.getOrderStatus().getDescription());
        		//createdOrder.set
        	}
        	*/
        
	}

	public List<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	

}