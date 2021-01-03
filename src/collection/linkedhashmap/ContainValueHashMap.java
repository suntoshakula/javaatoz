package collection.linkedhashmap;

import java.util.LinkedHashMap;

public class ContainValueHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String,String>();
		lhm.put("one", "one entry");
		lhm.put("two", "two entry");
		lhm.put("three", "three entry");
		System.out.println(lhm);
		System.out.println("map contain "+lhm.containsValue("one entry"));

	}

}
