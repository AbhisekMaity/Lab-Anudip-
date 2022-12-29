package com.jdbclab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeUploader {
	Scanner sc = new Scanner(System.in);
	int Department_ID;
	String Department_Name;
	String Department_Head;
	String Department_Description;
	
	int Employee_Id;
	String Employee_Name;
	String Employee_Address;
	double Employee_Salary;
	int Employee_Contact_No;
	int Department_Id;
	public void	storeDepartmentDetails() {
		
		
		try {
			// register the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// creating the connection 
			
			Connection conn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/abhiseklabdb","root","Abhiwork@123");
		
		
		
		System.out.println("Enter Department id");  // id
		Department_ID=sc.nextInt();
		
		System.out.println("Enter Department name"); // name
		Department_Name=sc.next();
		
		System.out.println("Enter Department Head name ");  // address
		Department_Head=sc.next();
		
		System.out.println("Enter department Description");  // department
		Department_Description=sc.next();
		
		PreparedStatement stmt = conn.prepareStatement
				("insert into departments values(?,?,?,?)");
			stmt.setInt(1,Department_ID);
			stmt.setString(2, Department_Name);
			stmt.setString(3, Department_Head);
			stmt.setString(4,Department_Description);
			stmt.executeUpdate();
			System.out.println("Successfully inserted the values ");

				
		}
				catch (Exception e) {
					// TODO: handle exception'
					System.out.println(e);
				}
		
	}
	public void storeEmployeeDetails(){
		try {
			// Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
//			Creating the connection
			Connection conn=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/abhiseklabdb","root","Abhiwork@123");
			
			System.out.println("Enter the id");  // id
			Employee_Id=sc.nextInt();
			
			System.out.println("Enter name"); // name
			Employee_Name=sc.next();
			
			System.out.println("Enter address ");  // address
			Employee_Address=sc.next();
			
			System.out.println("Enter Employee Salary");  // salary 
			
			Employee_Salary=sc.nextDouble(); 
			
			System.out.println("Enter phoneno");  //phone
			Employee_Contact_No=sc.nextInt();
			
			
			System.out.println("Enter department id");  // department
			Department_Id=sc.nextInt();
			
			PreparedStatement stmt=conn.prepareStatement("insert into employees values(?,?,?,?,?,?)");
			stmt.setInt(1, Employee_Id);
			stmt.setString(2, Employee_Name);
			stmt.setString(3, Employee_Address);
			stmt.setDouble(4, Employee_Salary);
			stmt.setInt(5, Employee_Contact_No);
			stmt.setInt(6, Department_Id);
			
			
			
			
			
			stmt.executeUpdate();
			
			System.out.println("Successfully inserted the values ");

			}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}
	
	public void retrieveEmployeeDetails(int id) {
		try {
		// Register the driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// now create the connection 
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhiseklabdb","root","Abhiwork@123");
		Statement stmt = conn.createStatement();
//		if(id!=0) {
			
			ResultSet rs = stmt.executeQuery("select * from employees where Employee_Id= "+id);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
				
		}
//		}
//			else {
//				System.out.println("Employee Id not Present");
//			}
			
		
		}
catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
}		
	}
}
