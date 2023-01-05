package com.HibernateEg;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

//@Entity - This Annotation specifies that the class is an entity 
//@Table - This Annotation specifies the table in the database with 
  // with which this entity is mapped.
//@ID - This Annotation specifies the primary key of the entity .

@Entity
@Table(name="employeee")
public class Student {
	@Id 
	private int StuId;
	private String stuFirstName,stuLastName,stuEmail,stuAddr;
	private double stuFees;
	private long stuPhone;
public int getStuId() {
		return StuId;
	}
	public String getStuFirstName() {
		return stuFirstName;
	}
	public String getStuLastName() {
		return stuLastName;
	}
	public String getStuEmail() {
		return stuEmail;
	}
	public String getStuAddr() {
		return stuAddr;
	}
	public double getStuFees() {
		return stuFees;
	}
	public long getStuPhone() {
		return stuPhone;
	}
	public void setStuId(int stuId) {
		StuId = stuId;
	}
	public void setStuFirstName(String stuFirstName) {
		this.stuFirstName = stuFirstName;
	}
	public void setStuLastName(String stuLastName) {
		this.stuLastName = stuLastName;
	}
	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}
	public void setStuAddr(String stuAddr) {
		this.stuAddr = stuAddr;
	}
	public void setStuFees(double stuFees) {
		this.stuFees = stuFees;
	}
	public void setStuPhone(long stuPhone) {
		this.stuPhone = stuPhone;
	}

  
}
