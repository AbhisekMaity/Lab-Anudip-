package com.Lab;

public class Book {//main book class
	
	//encapsulating all data members
	private String title, author;
	private int bookID;
	
	
	public Book(int bookID, String title, String author) {//parameterized constructor
	}
	
	
	public int getBookID() {
		return bookID;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
}

//creating custom exception class
class InvalidBookException extends Exception{	
	private static final long serialVersionUID = 1L;	//default serial id suggested by eclipse IDE

	//overloading InvalidBookException class 
	public InvalidBookException(String s) {	//parameterized constructor
		super(s);	//passing 's' argument to Exception super class
	}
}