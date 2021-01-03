package overriding;

class Dog {
	public void bark() {
		System.out.println("woof ");
	}
}

class Hound extends Dog{
	public void sniff() {
		System.out.println("sniff");
	}
	
	public void bark() {
		System.out.println("bowl");
	}
}



public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Hound();
		dog.bark();

	}

}
