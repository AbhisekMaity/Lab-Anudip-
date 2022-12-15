package Lab;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEvenNo {
	ArrayList<Integer> A1 = new ArrayList<Integer>();

	public ArrayList<Integer> storeEvenNumbers(int N) {

		for(int i=2;i<N;i+=2) {
			A1.add(i);
		}
		return A1;
	}
	public ArrayList<Integer> printEvenNumbers() {
		ArrayList<Integer> A2 = new ArrayList<Integer>();
System.out.println("Inside the the A1 the even no are ");
		 Iterator<Integer> itr = A1.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
		   System.out.println("After multiplying 2 the values inside the A2");
		   for(int val:A1) {
			   A2.add(val*2);
			   System.out.println(val*2);
		   }
		   return A2;
		
	}
public int	retrieveEvenNumber(int N) {
	if(A1.contains(N)) {
		return N;
	}
	else {
		return 0;
	}
}
  public static void main(String[] args) {
	  ArrayListEvenNo obj = new ArrayListEvenNo();
	  obj.storeEvenNumbers(50);
	  obj.printEvenNumbers();
	  int number  = obj.retrieveEvenNumber(48);
	  if(number==0) {
		  System.out.println("Opps this no is not contain inside the array list ");
	  }
	  else {
		  System.out.println("The value "+number+" contain inside the arraylist A1");
	  }
  }
}
