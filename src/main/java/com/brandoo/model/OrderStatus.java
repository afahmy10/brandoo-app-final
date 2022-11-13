package com.brandoo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ORDER_STATUS database table.
 * 
 */
@Entity
@Table(name="ORDER_STATUS")
@NamedQuery(name="OrderStatus.findAll", query="SELECT o FROM OrderStatus o")
public class OrderStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;

	private String description;

	public OrderStatus() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}