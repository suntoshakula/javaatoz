package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import collection.ObjMaxComparable;

public class ObjMaxComparableDemo {

	public static void main(String a[]){
        
        List<ObjMaxComparable> emps = new ArrayList<ObjMaxComparable>();
        emps.add(new ObjMaxComparable(10, "Raghu", 25000));
        emps.add(new ObjMaxComparable(120, "Krish", 45000));
        emps.add(new ObjMaxComparable(210, "John", 14000));
        emps.add(new ObjMaxComparable(150, "Kishore", 24000));
        ObjMaxComparable maxSal = Collections.max(emps);
        System.out.println("Employee with max salary: "+maxSal);
        ObjMaxComparable mixsal = Collections.min(emps);
        System.out.println("min sal "+mixsal);
      }

}
