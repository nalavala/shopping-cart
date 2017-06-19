package com.Nvr.Backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Carts {
	
	@Id
	@GeneratedValue
	int id;
	
	
	@OneToOne
	@JoinColumn(name="customer_id")
	Customers customer;
	int grandtotal;

	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(int grandtotal) {
		this.grandtotal = grandtotal;
	}
	
	

}
