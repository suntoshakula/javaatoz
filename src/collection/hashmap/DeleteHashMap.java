package collection.hashmap;

import java.util.HashMap;

public class DeleteHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("a", "aone");
		hm.put("b", "bone");
		hm.put("z", "zone");
		System.out.println(hm);
		hm.clear();
		System.out.println(hm);
	}

}
