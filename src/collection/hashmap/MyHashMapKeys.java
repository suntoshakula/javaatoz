package collection.hashmap;

import java.util.HashMap;
import java.util.Set;

public class MyHashMapKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("one", "aone");
		hm.put("two", "bone");
		hm.put("three", "cone");
		System.out.println(hm);
		Set<String> s = hm.keySet();
		for(String str:s) {
			System.out.println(str);
		}

	}

}
