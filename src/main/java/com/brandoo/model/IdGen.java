package com.brandoo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ID_GEN database table.
 * 
 */
@Entity
@Table(name="ID_GEN")
@NamedQuery(name="IdGen.findAll", query="SELECT i FROM IdGen i")
public class IdGen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GEN_NAME")
	private String genName;

	@Column(name="GEN_VAL")
	private int genVal;

	public IdGen() {
	}

	public String getGenName() {
		return this.genName;
	}

	public void setGenName(String genName) {
		this.genName = genName;
	}

	public int getGenVal() {
		return this.genVal;
	}

	public void setGenVal(int genVal) {
		this.genVal = genVal;
	}

}