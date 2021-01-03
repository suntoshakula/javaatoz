package collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyCheckedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map =  new HashMap();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", "four");
		System.out.println(map);
		Map rtnmap = Collections.checkedMap(map, String.class, Integer.class);
		rtnmap.put("four", "four");
		System.out.println(rtnmap);
		

	}

}
