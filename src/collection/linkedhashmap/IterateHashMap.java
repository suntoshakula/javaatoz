package collection.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Set;

public class IterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> lhm  = new LinkedHashMap<String,String>();
		lhm.put("one", "this is first element");
		lhm.put("two", "this is two element");
		lhm.put("three", "this is three element");
		Set<String> slhm = lhm.keySet();
		for(String s:slhm) {
			System.out.println("corresponding get value: "+lhm.get(s));
		}

	}

}
