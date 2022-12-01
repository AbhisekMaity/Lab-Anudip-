package com.Lab;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
 class FileInputAndOutputStream {
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	System.out.println("Enter your choice ");
    	System.out.println("Press 1 read the data from console and store into file ");
    	System.out.println("Press 2 for print the data from the file ");
    	
int n=sc.nextInt();
switch (n) {
    case 1:
    try {
        FileOutputStream f = new FileOutputStream("D:\\test1.txt");
        String str = "Welcome to Anudip Foundation";
        byte b[] = str.getBytes(); // converting string into byte array
        f.write(b);
        f.close();
        System.out.println("Welcome to Anudip Foundation");
    } catch (Exception e) {
        System.out.println(e);
    }
    break;
    case 2:
        try {
            // Write Byte to string
            FileInputStream f = new FileInputStream("D:\\test1.txt"); //destination
            int i=0;
            while((i=f.read())!=-1) {
                System.out.print((char)i);

            }
            f.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        break;
    default:
        System.out.println("Wrong Input");
}
    }
} 

