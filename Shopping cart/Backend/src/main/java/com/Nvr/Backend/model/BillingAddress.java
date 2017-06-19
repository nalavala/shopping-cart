package com.Nvr.Backend.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.*;

@Entity
public class BillingAddress {

	@Id
	@GeneratedValue
	int id;
	String streetname;
	String apartmentnumber;
	@NotEmpty
	String city;
	@NotEmpty
	String state;
	@NotEmpty
	String country;

	@NotEmpty
	@Size(min = 6, max = 6)
	String zipcode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getApartmentnumber() {
		return apartmentnumber;
	}

	public void setApartmentnumber(String apartmentnumber) {
		this.apartmentnumber = apartmentnumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
