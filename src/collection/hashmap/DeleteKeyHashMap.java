package collection.hashmap;

import java.util.HashMap;

import collection.Price;

public class DeleteKeyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Price, String> hm = new HashMap<Price,String>();
		hm.put(new Price("banana",20), "banana");
		hm.put(new Price("orange",23), "orange");
		System.out.println(hm);
		Price key = new Price("orange",23);
		hm.remove(key);
		System.out.println(hm);

	}

}
