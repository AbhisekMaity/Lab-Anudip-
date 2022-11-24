package com.Lab;
/*
 * Build and run the project
Right click RunnableThreadTest1 project and select Run.
Observe the result in the Output window.
Output Window ACBACBACBACBACABCABCABCABCABCB
 */
class RunnableTheads1 implements Runnable{
    String str;
    RunnableTheads1(String str){
        this.str=str;
    }
    @Override
    public void run() {
        for (int i = 0; i <4 ; i++) {
            System.out.print(str);
        }
    }
}
class RunnableTheads2 implements Runnable{
    String str;
    RunnableTheads2(String str){
        this.str=str;
    }
    @Override
    public void run() {
        for (int i = 0; i <1 ; i++) {
            System.out.print("ACA");
        }
    }
}
class RunnableTheads3 implements Runnable{
    String str;
    RunnableTheads3(String str){
        this.str=str;
    }
    @Override
    public void run() {
        for (int i = 0; i <4 ; i++) {
            System.out.print("BCA");
        }
    }
}
class RunnableTheads4 implements Runnable{
    String str;
    RunnableTheads4(String str){
        this.str=str;
    }
    @Override
    public void run() {
        for (int i = 0; i <1 ; i++) {
            System.out.print("BCB");
        }
    }
}
class RunnableTheadTest1 {
    public static void main(String[] args) throws InterruptedException {
        RunnableTheads1 obj1=new RunnableTheads1("ACB");
        Thread t1 = new Thread(obj1);
        t1.start();
        t1.join();

        RunnableTheads2 obj2=new RunnableTheads2("ACB");
        Thread t2 = new Thread(obj2);
        t2.start();
        t2.join();

        RunnableTheads3 obj3=new RunnableTheads3("ACB");
        Thread t3 = new Thread(obj3);
        t3.start();
        t3.join();

        RunnableTheads4 obj4=new RunnableTheads4("ACB");
        Thread t4 = new Thread(obj4);
        t4.start();

    }
}
