package collection.hashmap;

import java.util.HashMap;
import java.util.TreeMap;

import collection.Price;

public class FindUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Price, String> tm = new HashMap<Price,String>();
		tm.put(new Price("Banana",20), "Banana");
		tm.put(new Price("orange",21), "orange");
		System.out.println(tm);
		Price key = new Price("Banana",20);
		System.out.println(tm.containsKey(key));

	}

}
