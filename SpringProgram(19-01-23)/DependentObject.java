package com.spring.entity;

public class DependentObject {
	private int id;
   private String name;
   private String department;
public DependentObject(int id, String name, String department) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
}
public DependentObject() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "DependentObject [id=" + id + ", name=" + name + ", department=" + department + "]";
}
   
}
