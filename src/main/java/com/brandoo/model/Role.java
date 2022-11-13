package com.brandoo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ROLES database table.
 * 
 */
@Entity
@Table(name="ROLES")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer is;

	private String description;

	public Role() {
	}

	public Integer getIs() {
		return this.is;
	}

	public void setIs(Integer is) {
		this.is = is;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}