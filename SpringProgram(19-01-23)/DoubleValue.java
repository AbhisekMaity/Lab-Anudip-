package com.spring.entity;

public class DoubleValue {
 private double dbval;

public DoubleValue(double dbval) {
	super();
	this.dbval = dbval;
}

public DoubleValue() {
	super();
	// TODO Auto-generated constructor stub
}
 public void display() {
	 System.out.println("The double value is "+dbval);
 }
}
