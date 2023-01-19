package com.spring.entity;

import java.util.Iterator;
import java.util.List;

public class CollectionEg {
   private String name;
   private List<String> hobby;
public CollectionEg() {
	super();
	// TODO Auto-generated constructor stub
}
public CollectionEg(String name, List<String> hobby) {
	super();
	this.name = name;
	this.hobby = hobby;
}
public void display() {
	System.out.println("My name is "+name);
	System.out.println("My hobbies are ");
	Iterator<String> itr = hobby.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
