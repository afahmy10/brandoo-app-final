package com.brandoo.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.lang.Byte;
import java.nio.charset.StandardCharsets;


/**
 * The persistent class for the ORDER_ITEMS database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEMS")
@NamedQuery(name="OrderItem.findAll", query="SELECT o FROM OrderItem o")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Lob
	//@JsonIgnore
	private byte[] image;

	@Column(name="ITEM_STATUS")
	@JsonIgnore
	private Integer itemStatus;

	private String name;

	@Column(name="original_price")
	private Double originalPrice;

	@Column(name="Quantity")
	private Integer quantity;

	@Column(name="selling_price")
	private Double sellingPrice;
	@JsonInclude()
	@Transient
    String itemImage;


	public String getItemImage() {
		System.out.println("Inside GET item image");
		if(this.itemImage !=null && this.itemImage.length()>0) {
			return itemImage;
		}else if (image !=null){
			return (new String(image, StandardCharsets.UTF_8));
		}else {
			return itemImage;
		}
		//return itemImage;
	}

	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public OrderItem(Integer id, byte [] itemImage, int itemStatus, String name, Double originalPrice,
			Integer quantity, Double sellingPrice) {
		super();
		this.id = id;
		this.image = itemImage;
		this.itemStatus = itemStatus;
		this.name = name;
		this.originalPrice = originalPrice;
		this.quantity = quantity;
		this.sellingPrice = sellingPrice;
		//this.order = order;
	}

	//bi-directional many-to-one association to Order
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ORDER_ID")
	 @JsonBackReference

	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderItem() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
		System.out.println(new String(image, StandardCharsets.UTF_8));
		this.setItemImage(new String(image, StandardCharsets.UTF_8));
		System.out.println("Inside set item image");
	}

	public Integer getItemStatus() {
		return this.itemStatus;
	}

	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
		
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getOriginalPrice() {
		return this.originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getSellingPrice() {
		return this.sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

}