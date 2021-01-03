package collection.linkedhashset;

import java.util.LinkedHashSet;

import collection.Price;

public class LinkedHashUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Price> lhs = new LinkedHashSet<Price>();
		lhs.add(new Price("banana",20));
		lhs.add(new Price("apple",30));
		lhs.add(new Price("orange",35));
		System.out.println(lhs);
		lhs.add(new Price("banana",20));
		System.out.println(lhs);
		System.out.println(lhs.contains(new Price("banana",20)));
		lhs.remove(new Price("banana",20));
		System.out.println(lhs);
		

	}

}
