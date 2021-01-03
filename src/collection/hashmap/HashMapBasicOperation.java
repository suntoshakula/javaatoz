package collection.hashmap;

import java.util.HashMap;

public class HashMapBasicOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("first", "a");
		hm.put("second", "b");
		hm.put("third", "c");
		System.out.println(hm);
		System.out.println(hm.get("first"));
		System.out.println(hm.isEmpty());
		hm.remove("third");
		System.out.println(hm);
		System.out.println(hm.size());
		
		
	}

}
