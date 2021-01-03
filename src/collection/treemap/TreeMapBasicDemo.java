package collection.treemap;

import java.util.TreeMap;

public class TreeMapBasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> hm = new TreeMap<String,String>();
		hm.put("first", "first inserted");
		hm.put("second", "second inserted");
		hm.put("three", "three inserted");
		System.out.println(hm);
		System.out.println("second element exists "+hm.containsKey("second"));
		System.out.println("second value "+hm.get("second"));
		System.out.println("third value "+hm.get("third"));
		System.out.println("thrid value "+hm.get("three"));
		System.out.println("is treemap empty "+hm.isEmpty());
		hm.remove("three");
		System.out.println(hm);
	}

}
