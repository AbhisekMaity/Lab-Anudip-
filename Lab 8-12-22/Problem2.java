package com.Lab;
import java.util.*;

public class Problem2 {
  public static void main(String[] args) {
	List<String> colorlist=new ArrayList<>( );
	
	// insert values 
	colorlist.add("Red");

	colorlist.add("Green");
	colorlist.add("Orange");
	
	colorlist.add("White");


	colorlist.add("Black");

	System.out.println("Before change the array list :"+colorlist);

  // sub list values 
	
 List<String> newcol=colorlist.subList(0, 3);
	
	System.out.println("After change the array list :"+newcol);


	
}
}

