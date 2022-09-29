package com.cognizant.shapes;

public class Circle {
 float radius;
 float pi=3.5f;
   public Circle(){
	   radius=1.5f;
   }
   Circle(float radius){
	   this.radius=radius;
   }

  Circle(float radius,float pi){
	  this.radius=radius;
	  this.pi=pi;
  }
  public double calculateCircleArea(float radius) {
	  return pi*radius*radius;
  }
  public double calculateCircumference(float radius) {
	  return 2*pi*radius;
  }
}

