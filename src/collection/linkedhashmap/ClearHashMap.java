package collection.linkedhashmap;

import java.util.LinkedHashMap;

public class ClearHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String,String>();
		lhm.put("one", "one element");
		lhm.put("two", "two element");
		System.out.println("before clear "+lhm);
		lhm.clear();
		System.out.println("after clear "+lhm);

	}

}
