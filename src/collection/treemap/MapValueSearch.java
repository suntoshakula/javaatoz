package collection.treemap;

import java.util.TreeMap;

public class MapValueSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> tm =  new TreeMap<String,String>();
		tm.put("one", "insert one");
		tm.put("two", "insert two");
		System.out.println(tm);
		System.out.println(tm.containsValue("insert one"));
		System.out.println(tm.containsValue("thre"));

	}

}
