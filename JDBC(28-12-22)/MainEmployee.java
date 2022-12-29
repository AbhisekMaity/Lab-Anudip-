package com.jdbclab;

public class MainEmployee {
  public static void main(String[] args) {
	EmployeeUploader obj = new EmployeeUploader();
//	obj.storeDepartmentDetails();
	obj.storeEmployeeDetails();
	obj.retrieveEmployeeDetails(1);
  }
} 
