package com.Lab;

import java.util.ArrayList;

class ListLoader{
    ArrayList<Integer> L = new ArrayList<Integer>();
    public void loadList(Integer startNumber,Integer lastNumber){
        for (int i = startNumber; i <lastNumber ; i++) {
            L.add(i);
        }

    }
}
class MainArrayList{
    public static void main(String[] args) {
     ListLoader list = new ListLoader();
     long start,end;
     start=System.currentTimeMillis();
        System.out.println(start);
        list.loadList(1,10000000);
        end=System.currentTimeMillis();
        System.out.println(end);
        System.out.println("Total time taken for run the method "+(end-start)+"ms");
    }
}
