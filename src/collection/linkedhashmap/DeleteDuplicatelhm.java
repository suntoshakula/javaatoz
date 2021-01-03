package collection.linkedhashmap;

import java.util.LinkedHashMap;

import collection.Price;

public class DeleteDuplicatelhm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Price, String> lhm = new LinkedHashMap<Price,String>();
		lhm.put(new Price("banana",20), "banana");
		lhm.put(new Price("apple",30), "apple");
		System.out.println(lhm);
		
		Price s = new Price("banana",20);
		lhm.remove(s);
		System.out.println(lhm);		

	}

}
