package com.example.Entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PersonForm {
	@Size(min=4,max=8)
	@NotEmpty
	private String username;
	
	@NotEmpty
	@Size(min=8)
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	

}