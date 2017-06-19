package com.Nvr.Backend.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="supplier")
@Component
public class Supplier 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
   int sid;
   String sname,address;
   
   /*@OneToMany
   private List<Product> suppliers;*/
 
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return sname;
}
   
   
}
