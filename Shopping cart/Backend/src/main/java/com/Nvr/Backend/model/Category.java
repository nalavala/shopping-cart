package com.Nvr.Backend.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Category 
{
	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	private String description;
	
	/*@OneToMany
	private List<Product> products;*/

	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) 
	{
		this.cid = cid;
	}
	public String getCname() 
	{
		return cname;
	}
	public void setCname(String cname) 
	{
		this.cname = cname;
	}
	@Override
	public String toString() {
		return cname;
	}
	
	
}
