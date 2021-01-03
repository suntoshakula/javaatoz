package overloading;


class Dog{
	public void bark() {
		System.out.println("barking zero times");
	}
	
	public void bark(int loop) {
		System.out.println("barking "+loop+" times");
	}
}

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.bark();
		d.bark(3);
	}

}
