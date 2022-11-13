package com.brandoo.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ITEM_ORDER database table.
 * 
 */
@Embeddable
public class ItemOrderPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Integer ITEM_id;

	@Column(name="Order_id", insertable=false, updatable=false)
	private Integer order_id;

	public ItemOrderPK() {
	}
	public Integer getITEM_id() {
		return this.ITEM_id;
	}
	public void setITEM_id(Integer ITEM_id) {
		this.ITEM_id = ITEM_id;
	}
	public Integer getOrder_id() {
		return this.order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ItemOrderPK)) {
			return false;
		}
		ItemOrderPK castOther = (ItemOrderPK)other;
		return 
			(this.ITEM_id == castOther.ITEM_id)
			&& (this.order_id == castOther.order_id);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.ITEM_id;
		hash = hash * prime + this.order_id;
		
		return hash;
	}
}