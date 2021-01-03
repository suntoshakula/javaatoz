package a.javaexamples;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
public class ForEachRef {
   public static void main(String[] args) {
      List<String> fruits = new ArrayList<String>();
      List<String> fruitss = new ArrayList<String>();
      Map<Integer,String> hmap = new HashMap<Integer,String>();
      fruits.add("Apple");
      fruits.add("Orange");
      fruits.add("Banana");
      fruits.add("Pear"); 
      fruits.add("Mango");
      
      hmap.put(1, "monkey");
      hmap.put(2, "abc");
      hmap.put(3,"Apple");
      hmap.put(4,"Orange");      
      //lambda expression in forEach Method 
      fruits.forEach(str->System.out.println("new details "+str));
      fruits.forEach(System.out::println);
      
      
   }
}