package com.Lab;
import java.util.*;

public class Problem3 {
  public static void main(String[] args) {
	List<String> colorlist=new ArrayList<>( );
	
	// insert values 
	colorlist.add("Red");

	colorlist.add("Green");
	colorlist.add("Black");

	colorlist.add("White");
	colorlist.add("Pink");




	System.out.println("Before removing the array list :"+colorlist);
	System.out.println(" And :"+colorlist.isEmpty());


  // sub list values 
	
colorlist.removeAll(colorlist);	
	System.out.println("After removing the array list :"+colorlist);

	System.out.println(" And :"+colorlist.isEmpty());

	
}
}

