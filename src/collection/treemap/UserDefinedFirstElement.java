package collection.treemap;

import java.util.Map.Entry;
import java.util.TreeMap;

import collection.Empl;
import collection.MySalaryComp;

public class UserDefinedFirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Empl, String> trmap = new TreeMap<Empl,String>(new MySalaryComp());
		trmap.put(new Empl("ram",3000), "ram");
		trmap.put(new Empl("joke",2100), "joke");
		trmap.put(new Empl("Ram",3000), "RAM");
        trmap.put(new Empl("John",6000), "JOHN");
        trmap.put(new Empl("Crish",2000), "CRISH");
        trmap.put(new Empl("Tom",2400), "TOM");
		System.out.println(trmap);
		System.out.println(trmap.firstKey());
		System.out.println(trmap);
		System.out.println(trmap.firstEntry());
		Entry<Empl,String> ent = trmap.firstEntry();
		System.out.println(ent.getValue());
		System.out.println(ent.getKey());
		
		

	}

}
