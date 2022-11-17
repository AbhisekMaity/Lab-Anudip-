package com.Assignments;
/*
 * Take two numbers x and y. Throw the exception if the two numbers are negative else print the 
Product of x and y.
Input Format
The only line of input consists of two integers, x and y.
Constraints   -----      -20<= x, y <=20
Output Format
Print the product if both are positive else print the output as below:
java.lang.Exception: x and y should not be zero.

 */
import java.util.Scanner;

public class PosNegNumber {
  public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a <=0 || b<=0) {
		throw new Exception("x and y should not be zero");  // if condition true then throw exception
	}
	else {
		System.out.println("The product of two number is "+(a*b));
	}
  }
}
