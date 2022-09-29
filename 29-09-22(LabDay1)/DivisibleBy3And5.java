/*
 * Hands-on Exercise 2
Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by
both.

 */
package com.Lab;

public class DivisibleBy3And5 {
  public static void main(String[] args) {
	  System.out.println("The numbers are : ");
	for(int i=1;i<=100;i++) {
		if((i%3==0||i%5==0) || (i%3==0 && i%5==0)) {
			System.out.println(i);
		}
	}
}
}
