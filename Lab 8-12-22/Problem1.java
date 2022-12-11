package com.Lab;

import java.util.ArrayList;

public class Problem1 {
  public static void main(String[] args) {
	ArrayList colorlist=new ArrayList( );
	
	// insert values 
	colorlist.add("Red");
	colorlist.add("Blue");

	colorlist.add("Green");

	colorlist.add("Black");

	System.out.println("Before updation the array list :"+colorlist);

	// update value using set
	colorlist.set(2,"Yellow");
	
	System.out.println("After updation the array list :"+colorlist);


	
}
}
