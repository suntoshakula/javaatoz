package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class CompGenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		  
		System.out.println("Sorting by age...");  
		Collections.sort(al,new AgeComparatorGeneric());
		for(Student st: al) {
			System.out.println("name "+st.name+" age "+st.age);
		}
		
		System.out.println("Sorting by name...");
		Collections.sort(al,new NameComparatorGeneric());
		for(Student st:al) {
			System.out.println("name "+st.name+" age "+st.age);
			
		}
		
	}

}
