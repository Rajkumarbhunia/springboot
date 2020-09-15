package com.user.registration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Mongo database annotation.
@Document(collection = "empployee")
public class User {

	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	



	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email+ "]";
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}