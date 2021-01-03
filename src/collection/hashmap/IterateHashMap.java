package collection.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String,String>();
		
		hm.put("firs", "first value");
		hm.put("second", "second value");
		hm.put("third", "third value");
		System.out.println(hm);
		Set<Entry<String,String>> s = hm.entrySet();
		for(Entry<String,String> e :s) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

	}

}
