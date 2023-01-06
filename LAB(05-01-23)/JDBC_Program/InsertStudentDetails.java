

package com.loaderclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cms.Helper;



public class InsertStudentDetails {
	Scanner sc = new Scanner(System.in);
int id,db_id,age;
long phone;
  String name,email, address, qulification,department;
  Double fees;
  public void insertstdDetails(int id) throws SQLException{
	  Connection conn=Helper.con();
	  // create Statement method of Connection interface
	  // is used to create statement and store inside the object of statement interface 
	  
	  Statement stmt=conn.createStatement();
	  
	  // executeQuery() mehtod of statement interface is used to used execute queries to the database
	  // iniside the object of Result set interface 
	  
	  ResultSet rs = stmt.executeQuery
			  ("select * from student_details");
	  
	  // now getting the column of each record in the table of the table1 database
	  
	  while(rs.next()) {
		  db_id=rs.getInt(1);
		 
		  
	  
	  if(id==db_id) {
		  
		  System.out.println("Opp this student_id is alread exists ");
			break;
	  }

	  else {
		  System.out.println("Enter student name :");
		  name=sc.nextLine();
		  
		  System.out.println("Enter student age :");
		  age=sc.nextInt();
		  
		  System.out.println("Enter student phone no. ");
		  phone=sc.nextLong();
		  
		  System.out.println("Enter student email_id :");
		  email=sc.next();
		  
		  System.out.println("Enter student address");
		  address=sc.next();
		  
		  System.out.println("Enter student student qualification ");
		  qulification=sc.next();
		  
		  System.out.println("Enter studnet fees");
		  fees=sc.nextDouble();
		  
		  System.out.println("Enter student department ");
		  department=sc.nextLine();
		  
		  // prepared statement 
		  
		  PreparedStatement stmt2=conn.prepareStatement
				  ("insert into student_details values (?,?,?,?,?,?,?,?,?)");
		  stmt2.setInt(1, id);
		  stmt2.setString(2, name);
		  stmt2.setInt(3, age);
		  stmt2.setLong(4, phone);
		  stmt2.setString(5, email);
		  stmt2.setString(6, address);
		  stmt2.setString(7, qulification);
		  stmt2.setDouble(8, fees);
		  stmt2.setString(9, department);
		  stmt2.executeUpdate();
		  
		  System.out.println("Congratulation Your data successfully inserted ");
		  break;
	  }
  }}
}
