package collection.treemap;

import java.util.TreeMap;

public class TreeMapClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		TreeMap<String, String> tm = new TreeMap<String,String>();
		tm.put("one", "insertone");
		tm.put("two", "insert two");
		System.out.println(tm);
		tm.clear();
		System.out.println(tm);

	}

}
