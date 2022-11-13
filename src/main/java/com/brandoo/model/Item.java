package com.brandoo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ITEM database table.
 * 
 */
@Entity
@Table(name="ITEM")
@NamedQuery(name="Item.findAll", query="SELECT i FROM Item i")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Lob
	private byte[] image;

	private String name;

	@Column(name="original_price")
	private Double originalPrice;

	@Column(name="Quantity")
	private Integer quantity;

	@Column(name="selling_price")
	private Double sellingPrice;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="category")
	private Category categoryBean;

	//bi-directional many-to-one association to SizeRange
	@ManyToOne
	@JoinColumn(name="item_size")
	private SizeRange sizeRange;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="status")
	private Status statusBean;

	//bi-directional many-to-one association to Brand
	@ManyToOne
	@JoinColumn(name="brand")
	private Brand brandBean;

	//bi-directional many-to-one association to ItemOrder
	@OneToMany(mappedBy="item" ,fetch = FetchType.LAZY)
	private List<ItemOrder> itemOrders;

	public Item() {
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

	public Category getCategoryBean() {
		return this.categoryBean;
	}

	public void setCategoryBean(Category categoryBean) {
		this.categoryBean = categoryBean;
	}

	public SizeRange getSizeRange() {
		return this.sizeRange;
	}

	public void setSizeRange(SizeRange sizeRange) {
		this.sizeRange = sizeRange;
	}

	public Status getStatusBean() {
		return this.statusBean;
	}

	public void setStatusBean(Status statusBean) {
		this.statusBean = statusBean;
	}

	public Brand getBrandBean() {
		return this.brandBean;
	}

	public void setBrandBean(Brand brandBean) {
		this.brandBean = brandBean;
	}

	public List<ItemOrder> getItemOrders() {
		return this.itemOrders;
	}

	public void setItemOrders(List<ItemOrder> itemOrders) {
		this.itemOrders = itemOrders;
	}

	public ItemOrder addItemOrder(ItemOrder itemOrder) {
		getItemOrders().add(itemOrder);
		itemOrder.setItem(this);

		return itemOrder;
	}

	public ItemOrder removeItemOrder(ItemOrder itemOrder) {
		getItemOrders().remove(itemOrder);
		itemOrder.setItem(null);

		return itemOrder;
	}

}