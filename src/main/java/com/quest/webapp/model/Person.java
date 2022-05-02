package com.quest.webapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "person")
public class Person {
	
	@Id
	private String ppsNumber;
	
	@Column(name = "full_name")
	private String fullName;
	
	//Annotation @DateTimeFormat allowed me to use this format only
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	@Column(name = "mobile_phone")
	private String mobilePhone;

	public Person() {
		super();
	}

	public Person(String PPSNumber, String fullName, Date dateOfBirth) {
		super();
		this.ppsNumber = PPSNumber;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
	}

	public Person(String PPSNumber, String fullName, Date dateOfBirth, String mobilePhone) {
		super();
		this.ppsNumber = PPSNumber;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.mobilePhone = mobilePhone;
	}
	
	public String getPpsNumber() {
		return ppsNumber;
	}

	public void setPpsNumber(String ppsNumber) {
		this.ppsNumber = ppsNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
}
