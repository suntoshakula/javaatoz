package collection.treemap;

import java.util.TreeMap;

public class TreeCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, String> tm = new TreeMap<String,String>();
		tm.put("one", "insert 1");
		tm.put("one", "insert 2");
		System.out.println(tm);
		tm.put("two", "insert 3");
		tm.put("three", "insert 4");
		System.out.println(tm);
		
		TreeMap<String, String> subtm = new TreeMap<String,String>();
		subtm.put("sone", "one insert");
		subtm.put("stwo", "two insert");
		System.out.println(subtm);
		tm.putAll(subtm);
		System.out.println(tm);

	}

}
