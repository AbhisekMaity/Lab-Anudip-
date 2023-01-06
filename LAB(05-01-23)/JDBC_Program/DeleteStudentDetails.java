package com.loaderclass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cms.Helper;



public class DeleteStudentDetails {
  int id;
 int db_id;
  public void deleteStdDetails(int id) throws SQLException{
	  Connection conn=Helper.con();
	// create statement method of connection interface is used to create 
		  //  statement and store inside the object of statement interface 
		  
		  Statement stmt1 = conn.createStatement();
		  Statement stmt2 = conn.createStatement();

		  
		  
		   ResultSet rs = stmt1.executeQuery
				   ("select * from student_details where id = "+id);
		   while(rs.next()) {  // getting the column of each record in the table 
				  
				 db_id=rs.getInt(1);
		   }
				  if(db_id!=id) {
					  System.out.println("!!!Wrong id no ");
				  }
				 else {
					  stmt2.executeUpdate("delete from student_details where id = "+id);
					  System.out.println("=========Deleted Row=========");
	  
    }
  }
}

