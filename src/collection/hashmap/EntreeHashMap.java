package collection.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EntreeHashMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("first", "onea");
		hm.put("SEcond", "oneb");
		System.out.println(hm);
		Set<Entry<String, String>> entires = hm.entrySet();
		for(Entry<String,String> e: entires) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

	}

}
