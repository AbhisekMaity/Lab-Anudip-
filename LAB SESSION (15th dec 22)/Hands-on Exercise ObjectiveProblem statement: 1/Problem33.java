package Lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Problem33 {
	String CountryMap;
	HashMap<String,String> M1 = new HashMap<>();
	public HashMap<String,String> storeCountryCapital(String CountryName, String capital){
		M1.put(CountryName, capital);
		return M1;
	}
public String retrieveCapital(String CountryName) {
	return M1.get(CountryName);
}
public String retrieveCountry(String capitalName) {
	Set<Entry<String,String>> set = M1.entrySet();
	Iterator<Entry<String,String>> it=set.iterator();
	while(it.hasNext()) {
		Map.Entry<String, String> me = it.next();
		if(me.getValue().equals(capitalName)) {
			return me.getKey();
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	return M1.get(capitalName);
}
public HashMap<String, String> newMethod() {
	HashMap<String, String> M2 = new HashMap<String, String>();
	Set<Entry<String, String>> set = M1.entrySet();
	Iterator<Map.Entry<String, String>> it = set.iterator();
	while(it.hasNext()) {
		Map.Entry<String, String> me = it.next();
		M2.put(me.getValue(), me.getKey());
	}
	return M2;
	
}
public ArrayList<String> toArrayList() {
	ArrayList<String> list = new ArrayList<>();
	
	Set<Entry<String, String>> set = M1.entrySet();
	Iterator<Entry<String, String>> it = set.iterator();
	
	while (it.hasNext()) {
		Map.Entry<String, String> me = it.next();
		list.add(me.getKey());
	}
	
	return list;
}

	public static void main(String[] args) {
		Problem3 obj = new Problem3();

		obj.storeCountryCapital("India", "Delhi");
		obj.storeCountryCapital("Japan", "Tokyo");
		System.out.println(obj.retrieveCapital("India"));
		System.out.println(obj.retrieveCountry("Tokyo"));
		
		
	}

}
