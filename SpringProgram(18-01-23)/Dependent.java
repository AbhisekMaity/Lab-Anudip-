package com.spring.entity;

public class Dependent {
   private DependentObject dpdobj;

public Dependent(DependentObject dpdobj) {
	super();
	this.dpdobj = dpdobj;
}

public Dependent() {
	super();
	// TODO Auto-generated constructor stub
}
public void display() {
	System.out.println(dpdobj.toString());
}
}
