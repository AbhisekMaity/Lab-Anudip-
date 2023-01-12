package com.hibernate.bms.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.bms.config.HibernateUtil;
import com.hibernate.bms.dao.BankDao;
import com.hibernate.bms.entity.ApnaBank;

public class BankDaoImpl implements BankDao {

	public void createNewCustAcc() {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Please Enter custormer account no.");
		 long acno=sc.nextLong();
		 
		 System.out.println("Enter customer name");
		 String cname=sc.next();
		 
		 System.out.println("Enter customer Address");
		 String cadd=sc.next();
		 
		 System.out.println("Enter customer phone no.");
		 long cphone=sc.nextLong();
		 
		 System.out.println("Enter customer account pin ");
		 int pin = sc.nextInt();
		 
		 ApnaBank apb= new ApnaBank();
		 
		 apb.setAccountNo(acno);
		 apb.setCustName(cname);
		 apb.setCustAdd(cadd);
		 apb.setPhone(cphone);
		 apb.setAccPin(pin);
		 
		 Session session=HibernateUtil.getSessionFactory().openSession();
		 Transaction t = session.beginTransaction();
		 session.save(apb);
		 t.commit();
	}

	public void updateCustDetails() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account no ");
		long acno=sc.nextLong();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		ApnaBank apb=session.get(ApnaBank.class,acno);
		System.out.println("Enter the phone no which we want to update ");
		long cphone =sc.nextLong();
		apb.setPhone(cphone);
		session.update(apb);
		System.out.println("Successfully updated the value ");
		t.commit();
		}

	public void closeCustAcc() {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account no which we want to closed ");
		long acno=sc.nextLong();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		ApnaBank apb = session.get(ApnaBank.class,acno);
		session.delete(apb);
		System.out.println("Successfully closed your account ");
		t.commit();
		
		
}

	public void displayAccDetails() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account no. which we wnat to see the details ");
		long acno=sc.nextLong();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		ApnaBank apb = session.get(ApnaBank.class,acno);
		
		System.out.println(apb.getCusId()+" : "+apb.getAccountNo()+" : "+apb.getCustName()+" : "+apb.getCustAdd()+" : "+apb.getPhone()+" : "+apb.getAccPin());
		t.commit();
	}
  
}
