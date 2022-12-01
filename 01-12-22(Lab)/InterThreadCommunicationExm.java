package com.Lab;


class A{
    int balance=5000;
    boolean valueSet=false;
    public synchronized void put(int Add) {
        while (valueSet) {
            try {
                wait();
            }
            catch(Exception e) {

            }
        }
        balance=balance+Add;
        System.out.println("After deposit the account balance "+balance);
        valueSet=true;
        notify();

    }
    public synchronized void get(int get) {
        while (!valueSet) {
            try {
                wait();
            }
            catch(Exception e) {

            }
        }
        if(balance>0) {
            balance = balance - get;
            System.out.println("After withdraw the account balance " + balance);
            valueSet = true;
            notify();
        }
        else {
            System.out.println(" Sorry insufficient balance we can't withdraw the money");
            Thread.interrupted();
            notify();
        }
    }
}
class Producer implements Runnable{
    A a;
    Producer(A a){
        this.a=a;
        Thread t1 = new Thread(this,"Produceer");
        t1.start();
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        int i=0;
        while(true) {
            a.put(3000);
            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {

            }
        }
    }
}

class Cousumer implements Runnable{
    A a;
    Cousumer(A a){
        this.a=a;
        Thread t1 = new Thread(this,"Cousumer");
        t1.start();
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        int i=0;
        while(true) {
            a.get(1000);
            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {

            }
        }
    }
}
 class InterThreadCommunicationExm {
    public static void main(String[] args) {
        A a = new A();
        new Producer(a);
        new Cousumer(a);
    }
}

