package a.javaexamples;
import java.util.HashMap;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(1,"monkey");
		hmap.put(2, "dog");
		hmap.put(3, "donkey");
		hmap.forEach((key,value)-> System.out.println(key+""+value));
		//hmap.forEach(System.out::println);
		hmap.forEach((key,value)->{
			if(key==4) {
				System.out.println("value associated with key 4 is"+value);
			}
		});

	}

}
