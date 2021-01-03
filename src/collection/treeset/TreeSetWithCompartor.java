package collection.treeset;

import java.util.TreeSet;

import collection.Empl;
import collection.MyNameComp;
import collection.MySalaryComp;

public class TreeSetWithCompartor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Empl> em = new TreeSet<Empl>(new MyNameComp());
		em.add(new Empl("ram",3000));
		em.add(new Empl("kg", 2100));
		em.add(new Empl("a",11));
		em.add(new Empl("z",121));
		System.out.println(em);
		
		for(Empl e: em) {
			System.out.println(e.getName());
			System.out.println(e.getSalary());
		}
		
		
		TreeSet<Empl> es = new TreeSet<Empl>(new MySalaryComp());
		es.add(new Empl("ram",3000));
		es.add(new Empl("kg", 2100));
		es.add(new Empl("a",11));
		es.add(new Empl("z",121));
		System.out.println(es);

	}

}
