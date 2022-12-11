package com.Lab;



import java.util.*;
public class Problem4 {
public static void main(String[] args) {
 ArrayList<String> list1= new ArrayList<String>();
 list1.add("Red");
 list1.add("Green");
 list1.add("Black");
 list1.add("White");
 list1.add("Pink");
	System.out.println("First array list :"+list1);

        ArrayList<String> list2= new ArrayList<String>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Black");
        list2.add("Pink");
    	System.out.println("second array list :"+list2);

        ArrayList<String> newlist = new ArrayList<String>();
        for (String e : list1)
        	newlist.add(list2.contains(e) ? "Yes" : "No");
        System.out.println(newlist);
       
   }
}
