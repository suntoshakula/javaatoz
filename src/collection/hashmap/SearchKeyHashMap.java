package collection.hashmap;

import java.util.HashMap;

public class SearchKeyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("a", "a first");
		hm.put("b", "b first");
		System.out.println(hm);
		if(hm.containsKey("a")) {
			System.out.println(true);
		}else if(hm.containsKey("fifth")) {
			System.out.println(false);
		}

	}

}
