package collection.treemap;

import java.util.TreeMap;

public class MapKeySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, String> tms = new TreeMap<String,String>();
		tms.put("one", "one value");
		tms.put("two","two value");
		tms.put("three", "three value");
	System.out.println(tms);
	System.out.println(tms.containsKey("one"));
	

	}

}
