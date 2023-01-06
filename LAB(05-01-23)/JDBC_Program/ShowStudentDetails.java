package com.loaderclass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cms.Helper;


public class ShowStudentDetails {
	int id;
	int db_id;
  public void showstdDetails(int id) throws SQLException{
	  Connection conn=Helper.con();
	  // create statement method of connection interface is used to create 
	  //  statement and store inside the object of statement interface 
	  
	  Statement stmt1 = conn.createStatement();
	  Statement stmt2 = conn.createStatement();

	  
	  ResultSet rs = stmt1.executeQuery
			  ("select * from student_details where id ="+id);
	  
	  // executeQuery() method of statement interface is used to execute queries 
	  // to the database, inside object of RsultSet interface.
	  
	  while(rs.next()) {  // getting the column of each record in the table 
		  
		 db_id=rs.getInt(1);
	  }
		  if(db_id != id) {
			  System.out.println("Wrong id no/ ");
		  }
		  
		  else {
			  System.out.println("=============================");
			  System.out.println("Details of Student: ");
			  
			  ResultSet rs1 = stmt2.executeQuery("select * from student_details where id= "+id);
			  while(rs1.next()) {
				  System.out.println("StudentID   :"+rs1.getInt(1));
				  System.out.println("Student Name  :"+rs1.getString(2));
				  System.out.println("Student Age   :"+rs1.getInt(3));
				  System.out.println("Student Phone   :"+rs1.getLong(4));
				  System.out.println("Student Email   :"+rs1.getString(5));
				  System.out.println("Student Address  :"+rs1.getString(6));
				  System.out.println("Student Qualification  :"+rs1.getString(7));
				  System.out.println("Student fees  :"+rs1.getDouble(8));
				  System.out.println("Student Department  :"+rs1.getString(9));


				  
				  System.out.println("=======================================");

			  }
			  rs1.close();
		  }
		  
	 
	  
rs.close();
  }
}
