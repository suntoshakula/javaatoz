package collection.hashmap;

import java.util.TreeMap;

public class SearchValueHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> hm = new TreeMap<String,String>();
		hm.put("a", "afirst");
		hm.put("b", "bfirst");
		hm.put("c", "cfirst");
		System.out.println(hm);
		if(hm.containsValue("afirst")) {
			System.out.println("exists");
		}else if(hm.containsValue("zfirst")) {
			System.out.println();
		}

	}

}
