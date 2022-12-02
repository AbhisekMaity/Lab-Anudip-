package com.Lab;
import java.io.FileInputStream;
import java.util.ArrayList;
// Write a java program to store text file content line by line into an array
 class StoreValueAnarray {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("D:\\test1.txt"); //destination
            int i=0;
            ArrayList<Character> arr = new ArrayList<>();
            while((i=f.read())!=-1) {
                    arr.add((char)i);  // store value
            }
            for (char val:arr) {
                System.out.print(val);  // print the array values 
            }
            f.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
