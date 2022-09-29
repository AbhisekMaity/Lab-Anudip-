package com.cognizant.shapes;

public class Areas {
  public static void main(String[] args) {
	Circle obj3= new Circle(10.0f,3.14f);
	System.out.println("The area of the circle is "+obj3.calculateCircleArea(3.8f));
	System.out.println("The circumference of the circle is "+obj3.calculateCircumference(4.6f));
}
}
