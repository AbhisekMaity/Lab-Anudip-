package com.bookutil;
import com.Lab.Book;
import com.Lab.BookStore;
import java.util.Scanner;



public class BookUtil {
	public static void main(String[] args){									//main method
		BookStore obj = new BookStore();								//instantiating BookStore object
		Scanner s  = new Scanner(System.in);								//instantiating scanner object
		
		

		for(int i=1; i<=3; i++) {									//running for loop three times to add 3 book instances
		//taking inputs from user 
		
		System.out.println("For book-"+i);
		System.out.println("Enter bookID:");
		Scanner scanBookID  = new Scanner(System.in);								//instantiating scanner object
		int bookID = scanBookID.nextInt();									//taking input for bookID
		
		System.out.println("Enter title:");
		Scanner scanTitle  = new Scanner(System.in);								//instantiating scanner object
		String title = scanTitle.nextLine();									//taking input for title
		
		System.out.println("Enter author:");
		Scanner scanAuthor  = new Scanner(System.in);								//instantiating scanner object
		String author = scanAuthor.nextLine();									//taking input for author
											
		obj.addBook(new Book(bookID,title,author));						//adding Book instances into BookStore
		obj.displayAll(); 
		
		if(i!=4) {	//condition for close scanner input stream
			continue;
		}
		//closing all scanner input streams
		scanBookID.close();
		scanTitle.close();
		scanAuthor.close();
		}	//for loop end
	
		System.out.println("\nEnter title to search book: ");
		String title = s.nextLine();									//taking input for price
		System.out.println("\nSearched by title");
		obj.searchByTitle(title);									//searching book by book title 
		
		System.out.println("\nEnter author name to search book");
		String author = s.nextLine();									//taking input for price
		System.out.println("\nSearched by author");
		obj.searchByAuthor(author);									//searching book by author name
		
		System.out.println("\nPrinting all books:");
		obj.displayAll(); 										//displaying all books with details
		
		s.close(); 											//closing input stream
	}
	
}