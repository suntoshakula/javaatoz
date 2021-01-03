package collection.treemap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class GetAllEntries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> tm = new TreeMap<String,String>();
		tm.put("one", "insert one");
		tm.put("two","insert two");
		tm.put("three", "insert three");
		System.out.println(tm);
		Set<Entry<String, String>> es = tm.entrySet();
		System.out.println(es);
		for(Entry<String,String> e:es) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		

	}

}
