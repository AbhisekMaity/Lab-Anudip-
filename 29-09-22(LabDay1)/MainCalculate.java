/*
 * Hands-on Exercise 3
1… Write the following code:
1. A class named Arithmetic with a method named add that takes integers as
parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic
 */
package com.Lab;
class Arithmetic{
	public int add(int a,int b) {
		return a+b;
	}
}
class Adder extends Arithmetic{
	
}
public class MainCalculate {
	public static void main(String[] args) {
		
	Adder sum =new Adder();
	System.out.println("The sum of two no is "+sum.add(23,67));
	}
}
