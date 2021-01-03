package collections.type.array;

import java.util.ArrayList;
import java.util.Iterator;

class ListClass {
	int rollno;
	String name;
	int age;

	ListClass(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;

	}

	public static void main(String[] args) {
		
		ListClass ls1 = new ListClass(101, "java", 2);
		ListClass ls2 = new ListClass(102, "dotnet", 21);
		ListClass ls3 = new ListClass(103, "ios", 22);
		ListClass ls4 = new ListClass(104, "mac", 23);
		
		ArrayList<ListClass> al = new ArrayList<>();
		al.add(ls1);
		al.add(ls2);
		al.add(ls3);
		al.add(ls4);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			ListClass s = (ListClass)itr.next();
			System.out.println(s.rollno + " "+s.name + " "+s.age);
			
		}
	}

}
