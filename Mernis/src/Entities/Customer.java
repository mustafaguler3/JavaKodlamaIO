package Entities;
import java.util.Calendar;
import java.util.Date;

import Abstracts.Entity;



public class Customer implements Entity{
	
	private int id;
	private String FirstName;
	private String Lastname;
	private Date birthDate;
	private long NationalityId;
	
	
	
	
	public Customer(int id, String firstName, String lastname, Date birthDate, long nationalityId) {
		super();
		this.id = id;
		this.FirstName = firstName;
		this.Lastname = lastname;
		this.birthDate = birthDate;
		this.NationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}	
	public long getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(long nationalityId) {
		NationalityId = nationalityId;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
	

}
