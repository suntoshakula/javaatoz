package collection.treeset;

import java.util.TreeSet;

import collection.Empl;
import collection.MySalaryComp;

public class TreeSetSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Empl> salComp = new TreeSet<Empl>(new MySalaryComp());
		salComp.add(new Empl("Ram",3000));
		salComp.add(new Empl("John",6000));
		salComp.add(new Empl("Crish",2000));
		salComp.add(new Empl("Tom",2400));
		System.out.println("Least salary emp: "+salComp.first());
		System.out.println("high "+salComp.last());
	}

}
