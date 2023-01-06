package com.cms;




import java.awt.DisplayMode;
import java.util.Scanner;

import com.loaderclass.DeleteStudentDetails;
import com.loaderclass.InsertStudentDetails;
import com.loaderclass.ShowStudentDetails;



public class CollegeManagementSystem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int variable,id;
    	do {
    		System.out.println("========>>>  Welcome to our College Management System  <<<=========       ");
    		 System.out.println("Please Enter Your choice");
 		    System.out.println("Press 1 for Insert New Student Details :");
 		    System.out.println("Press 2 for Display the the Student Details :");
 			System.out.println("Press 3 for Delete the Student Details :");
 	
 			System.out.println("Press 4 for Exit from the program :");
 			
 			variable = sc.nextInt();
 			System.out.println("======================================");
 			switch (variable) {
			case 1:
				
				System.out.println("Enter Student ID");
				 id = sc.nextInt();
				InsertStudentDetails op1=new InsertStudentDetails();
				op1.insertstdDetails(id);
//				System.out.println("=======New Student Inserted Successfully======");
				
				break;
			case 2:
				System.out.println("Enter Student ID");
				 id = sc.nextInt();
				ShowStudentDetails op2=new ShowStudentDetails();
				op2.showstdDetails(id);
				break;
			case 3:
				System.out.println("Enter Student ID");
				 id = sc.nextInt();
				DeleteStudentDetails op3=new DeleteStudentDetails();
				op3.deleteStdDetails(id);
				break;
			
			case 4:
				System.err.println("You have sucessfully logged out");
				System.out.println("__THANK YOU__");
				System.out.println();
				System.exit(0);
				break;

			}
    	}while(variable > 0 && variable < 5);
		
	}
}
