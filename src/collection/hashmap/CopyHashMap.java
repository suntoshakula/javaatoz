package collection.hashmap;

import java.util.HashMap;

public class CopyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("a", "first");
		hm.put("z", "second");
		System.out.println(hm);
		HashMap<String,String> shm = new HashMap<String,String>();
		shm.put("b", "thrid");
		shm.put("c", "fourth");
		System.out.println(shm);
		hm.putAll(shm);
		System.out.println(hm);

	}

}
