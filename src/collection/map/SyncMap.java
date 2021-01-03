package collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SyncMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> mp = new HashMap<String, String>();

		Map<String, String> sysMapt = Collections.synchronizedMap(mp);
		System.out.println("Synchronized map got created...");

	}

}
