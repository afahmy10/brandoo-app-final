package com.brandoo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ITEM_ORDER database table.
 * 
 */
@Entity
@Table(name="ITEM_ORDER")
@NamedQuery(name="ItemOrder.findAll", query="SELECT i FROM ItemOrder i")
public class ItemOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemOrderPK id;

	@Column(name="item_price")
	private Integer itemPrice;

	private Integer quantity;

	//bi-directional many-to-one association to Item
    @JoinColumn(name = "ITEM_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
	private Item item;

	//bi-directional many-to-one association to Order
    @JoinColumn(name = "Order_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
	private Order order;

	public ItemOrder() {
	}

	public ItemOrderPK getId() {
		return this.id;
	}

	public void setId(ItemOrderPK id) {
		this.id = id;
	}

	public Integer getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}