package Entities.Concretes;

import Entities.Abstracts.Entity;

public class User implements Entity{

	private int Id;
	private String name;
	private String surname;
	private String email;
	private String password;
	private boolean Verification;

	

	public User(int id, String name, String surname, String email, String password) {
		super();
		Id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isVerification() {
		return Verification;
	}

	public void setVerification(boolean verification) {
		Verification = verification;
	}

	
	
	
	
	
	
}
