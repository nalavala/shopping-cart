package com.Nvr.Backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Component
public class User 
{
	
   
    
    @Id
    @Size(min=3,max=30, message="Username Size can be between 3 and 30")
    @NotEmpty (message = "User full name can not be empty.")
	private String username;
    @NotEmpty (message = "Password can not be empty.")
	private String password;
	private String role;
	@NotEmpty (message = "Email can not be empty.")
	@Pattern(regexp=".+@.+\\.[a-z]+", message = "email format abc@xyz.com")
	private String email;
	@NotEmpty (message = "Phone can not be empty.")
	@Pattern(regexp="\\d{10}" , message = "Enter 10 digit phone number")
	private String mobile;
	@NotEmpty (message = "Address can not be empty.")
	private String address;
   
    
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
