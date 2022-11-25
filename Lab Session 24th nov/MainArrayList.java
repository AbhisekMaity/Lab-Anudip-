package com.Lab;

import java.util.ArrayList;

class ListLoader{  // without using thread 
    ArrayList<Integer> L = new ArrayList<Integer>();
    public void loadList(Integer startNumber,Integer lastNumber){
        for (int i = startNumber; i <lastNumber ; i++) {
            L.add(i);
        }

    }
}

class LoaderThread implements Runnable{  // with using thread 
	int startNumber,lastNumber;
	LoaderThread(int startNumber,int lastNumber){
		this.startNumber=startNumber;
		this.lastNumber=lastNumber;
		}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    ArrayList<Integer> L = new ArrayList<Integer>();
	    for (int i = startNumber; i <lastNumber ; i++) {
            L.add(i);
	    }
	    for(int j:L) {
	    	System.out.println(j);
	    }
	}
}
class MainArrayList{
    public static void main(String[] args) throws InterruptedException {
//     ListLoader list = new ListLoader();
//     long start,end;
//     start=System.currentTimeMillis();
//        System.out.println(start);
//        list.loadList(1,10000000);
//        end=System.currentTimeMillis();
//        System.out.println(end);
//        System.out.println("Total time taken for run the method "+(end-start)+"ms");
    Runnable r=new LoaderThread(0,10);
    Thread t=new Thread(r);
    int a =(int)System.currentTimeMillis(); // time taken before executing 
    System.out.println("Response time before execution loadList method " +a);
    t.start();
    int b =(int)System.currentTimeMillis(); // time taken after executing 

    System.out.println("Response time before execution loadList method " +b);
    System.out.println("Response time "+(b-a));
    
    }
}
