package clonnable;

public class DogNameDemo {

	public static void main(String[] args) {
		DogName obj1 = new DogName("Tommy");
		DogName obj3 = new DogName();
		DogName obj4 = obj3;

		try {

			System.out.println("***no clone***");
			obj3.setDname("tommy added");
			System.out.println("obj3: " + obj3.getName());
			System.out.println("obj4: " + obj4.getName());
			
			System.out.println("modification noclone");
			obj3.setDname("tommy revised");
			System.out.println("obj4: " + obj4.getName());
			
			System.out.println("***clone***");
			DogName obj2 = (DogName) obj1.clone();
			System.out.println("obj2:" +obj2.getName());	
			
			System.out.println("modification clone");
			obj1.setDname("tommy clone change");
			System.out.println("obj2:" +obj2.getName());
			System.out.println("obj1:"+obj1.getName());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
