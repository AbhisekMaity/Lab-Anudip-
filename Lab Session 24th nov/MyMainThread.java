package com.Lab;
/*
 * Create two threads to print even numbers and odd numbers from 1 to 100?
note: after printing of all even numbers only odd numbers should print
 */
class PrintEvenNoThread implements Runnable{
    @Override
    public void run() {
        System.out.println("All Even nos are "); 
        // for printing even numbers 
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
class PrintOddNoThread implements Runnable {
    @Override
    public void run() {
        System.out.println("\nAll Odd nos are ");  
        //  for printing odd numbers 
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
class MyMainThread{
    public static void main(String[] args) throws InterruptedException {
        PrintEvenNoThread obj1=new PrintEvenNoThread();
        Thread t1 = new Thread(obj1);
        t1.start();  // first thread will start 
        t1.join(); // t2 wait for completing t1 then t2 start 
        PrintOddNoThread obj2=new PrintOddNoThread();
        Thread t2 = new Thread(obj2);
        t2.start(); // then second thread will start

    }
}
