package collection.linkedhashmap;

import java.util.LinkedHashMap;

import collection.Price;

public class UserDefinedDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		LinkedHashMap<Price, String> lhmud = new LinkedHashMap<Price, String>();

		lhm.put("one", "enter one");
		lhm.put("two", "enter two");
		String msg = "helloworld";
		System.out.println(lhm);
		lhm.put("two", "enter two");
		System.out.println("hashcode: " + msg.hashCode());
		System.out.println(lhm);

		lhmud.put(new Price("banana", 20), "banana");

		Price p = new Price("banana", 20);
		System.out.println("adding duplicate key");
		lhmud.put(p, "banana");
		lhmud.put(new Price("banana", 20), "banana");
		lhmud.put(new Price("apple", 30), "apple");
		lhmud.put(new Price("kate", 30), "kate");
		lhmud.put(new Price("banana", 20), "keg");
		System.out.println(lhmud);

	}

}
