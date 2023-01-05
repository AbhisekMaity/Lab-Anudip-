package com.HibernateEg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // Configuration - activates hibernate framework
    // Configure - read both cfg files and mapping details 
        
        // buildSessionFactory -from cfg object it takes jdbc information and create a jdbc connection
    
        SessionFactory s = new Configuration().configure().buildSessionFactory();
        // Opens an connection with db and session object perform CURD
        Session ses = s.openSession();
        // one of the method od session factory to get session obj
        // operation performed in db,save permanant
        Transaction t = ses.beginTransaction();
        
        // use object to enter data in table using setter method 
//        Student s1 = new Student();
//        s1.setStuId(101);
//        s1.setStuFirstName("Abhisek");
//        s1.setStuLastName("Maity");
//        s1.setStuEmail("abhi23@gmail.com");
//        s1.setStuPhone(856231782);
//        s1.setStuAddr("Kolkata");
//        s1.setStuFees(2000);
        
        Student s2 = new Student();
        s2.setStuId(102);
        s2.setStuFirstName("Arnab");
        s2.setStuLastName("Maity");
        s2.setStuEmail("arnab23@gmail.com");
        s2.setStuPhone(856231458);
        s2.setStuAddr("Mumbai");
        s2.setStuFees(6000);
        
        Student s3 = new Student();
        s3.setStuId(103);
        s3.setStuFirstName("Akash");
        s3.setStuLastName("Maity");
        s3.setStuEmail("akash23@gmail.com");
        s3.setStuPhone(857456321);
        s3.setStuAddr("Kolkata");
        s3.setStuFees(7000);
        
        Student s4 = new Student();
        s4.setStuId(104);
        s4.setStuFirstName("Anita");
        s4.setStuLastName("Maity");
        s4.setStuEmail("anita23@gmail.com");
        s4.setStuPhone(856457782);
        s4.setStuAddr("Patna");
        s4.setStuFees(9000);
        
        Student s5 = new Student();
        s5.setStuId(105);
        s5.setStuFirstName("Suman");
        s5.setStuLastName("Maity");
        s5.setStuEmail("sum23@gmail.com");
        s5.setStuPhone(856231282);
        s5.setStuAddr("Kolkata");
        s5.setStuFees(4000);
        //Session object is used to save the persistent object
//        ses.save(s1);
        ses.save(s2);
        ses.save(s3);
        ses.save(s4);
        ses.save(s5);

        //transaction object to commit changes
        t.commit();
        
    }
}


