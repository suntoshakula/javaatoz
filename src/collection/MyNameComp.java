package collection;

import java.util.Comparator;

public class MyNameComp implements Comparator<Empl>{
	
	@Override
	public int compare(Empl e1, Empl e2) {
		return e1.getName().compareTo(e2.getName());
		
	}
}
