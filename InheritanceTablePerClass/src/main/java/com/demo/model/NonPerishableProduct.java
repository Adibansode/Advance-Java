package com.demo.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="NonPerishable6")
public class NonPerishableProduct extends Product{
	
	private String category;

	public NonPerishableProduct() {
		super();
	}

	public NonPerishableProduct(int pid, String pname, Date mdate,String category) {
		super(pid, pname, mdate);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "NonPerishableProduct [category=" + category + "]";
	}
	
	

}
