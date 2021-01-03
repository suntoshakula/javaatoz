package collection.hashmap;

import java.util.HashMap;

import collection.Price;

public class DuplicateKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Price, String> hm = new HashMap<Price, String>();
		hm.put(new Price("Banana",20), "banana");
		hm.put(new Price("orange",21), "orange");
		System.out.println(hm);
		hm.put(new Price("Banana",20), "banana");
		System.out.println(hm);

	}

}
