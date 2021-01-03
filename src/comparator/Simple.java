package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Simple {
	public static void main(String args[]) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));
		System.out.println("sorting by age");
		Collections.sort(al, new AgeComparator());
		Iterator<Student> ite = al.iterator();
		while(ite.hasNext()) {
			Student stu = (Student)ite.next();
			System.out.println("next elements: "+stu.age);
		}
		
		System.out.println("sorting by name");
		Collections.sort(al,new NameComparator());
		Iterator<Student> nameite = al.iterator();
		while(nameite.hasNext()) {
			Student stu = (Student)nameite.next();
			System.out.println("next elements: "+stu.name);
		}
	}
}