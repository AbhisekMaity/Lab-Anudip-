package com.Lab;

import java.io.FileInputStream;

class FileIntoByteArray{
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\test1.txt");
            byte arr[]=new byte[1024];
            int i=0;
            while ((i=fin.read())>0){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
