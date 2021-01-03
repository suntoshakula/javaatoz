package collection.linkedhashmap;

import java.util.LinkedHashMap;

import collection.Price;

public class UserDefinedFinded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap< Price, String> lhm = new LinkedHashMap<Price,String>();
		lhm.put(new Price("banana",20), "banana");
		lhm.put(new Price("apple",30), "apple");
		System.out.println(lhm);
		Price key = new Price("banana",20);
		System.out.println("contains key "+lhm.containsKey(key));
		

	}

}
