package com.qsp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Student_Name")
	private String name;

	@Column(name = "Stream")
	private String stream;

	@Column(name = "year_of_pass")
	private int passOut;

	@Column(name = "Student_Email")
	private String email;

	@Column(name = "Student_Phone")
	private long phone;

	@Column(name = "Student_Rating")
	private String rating;

	public Student() {

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getPassOut() {
		return passOut;
	}

	public void setPassOut(int passOut) {
		this.passOut = passOut;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getRating() {
		return rating;
	}
	
	public void setRating(String rating)
	{
		this.rating = rating;
	}

}
