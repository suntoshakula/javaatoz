package collection.treemap;

import java.util.Set;
import java.util.TreeMap;

public class IterateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, String> hm = new TreeMap<String,String>();
		hm.put("one", "inserted");
		hm.put("two", "two inserted");
		hm.put("three", "three inserted");
		System.out.println(hm);
		
		System.out.println("iterate through treemap");
		Set<String> tmks = hm.keySet();
		for(String tmk:tmks) {
			System.out.println(hm.get(tmk));
		}		

	}

}
