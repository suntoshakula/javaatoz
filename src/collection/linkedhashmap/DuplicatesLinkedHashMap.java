package collection.linkedhashmap;

import java.util.LinkedHashMap;

public class DuplicatesLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String,String>();
		lhm.put("one", "abc");
		lhm.put("two", "def");
		lhm.put("three", "efg");
		System.out.println(lhm);		
		lhm.put("four", "abc");
		System.out.println(lhm);
		lhm.put("four", "abc");
		System.out.println(lhm);
		lhm.put("four", "efg");
		System.out.println(lhm);

	}

}
