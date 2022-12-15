package com.Lab;

import java.util.HashSet;
import java.util.Iterator;

public class Problem2 {
	String Country;
	 HashSet<String> H1 = new HashSet<String>();

	 public HashSet<String> storeCountryNames(String CountryName){
			H1.add(CountryName);
			return H1;

	 }
	 public String retrieveCountry(String CountryName) {
		 Iterator<String> itr = H1.iterator();
		   while(itr.hasNext()) {
			   if(itr.next().equals(CountryName)) {
				   return CountryName;
			   }

		   }
			return null;

		   
	 }
  public static void main(String[] args) {
	Problem2 obj=new Problem2();
	obj.storeCountryNames("India");
	obj.storeCountryNames("USA");

	obj.storeCountryNames("Dubai");

	obj.storeCountryNames("America");
	
	String cnt=obj.retrieveCountry("America");
	if(cnt==null) {
		System.out.println("This country is't present in the hashset");
	}
	else {
		System.out.println("Yes the country " +cnt+ " present is hashset ");
	}
	
	

	
  }
}
