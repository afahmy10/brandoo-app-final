package com.brandoo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SIZE_RANGE database table.
 * 
 */
@Entity
@Table(name="SIZE_RANGE")
@NamedQuery(name="SizeRange.findAll", query="SELECT s FROM SizeRange s")
public class SizeRange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;

	@Column(name="item_size")
	private String itemSize;

	public SizeRange() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemSize() {
		return this.itemSize;
	}

	public void setItemSize(String itemSize) {
		this.itemSize = itemSize;
	}

}