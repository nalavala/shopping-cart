package com.Nvr.Backend.model;

import javax.persistence.*;

@Entity
public class Authorities {

	@Id
	@GeneratedValue
	int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	String username;
	String role;
	
}
