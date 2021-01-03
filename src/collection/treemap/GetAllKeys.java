package collection.treemap;

import java.util.Set;
import java.util.TreeMap;

public class GetAllKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> hm = new TreeMap<String,String>();
		hm.put("one", "insertone");
		hm.put("two", "inserttwo");
		System.out.println(hm);
		Set<String> shm = hm.keySet();
		for(String s:shm) {
			System.out.println(s);
			System.out.println(hm.get(s));
		}
		
	}

}
