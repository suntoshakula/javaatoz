package SuperEx;

public class Dog extends Animal{
	String color = "black";
	public Dog() {
		// TODO Auto-generated constructor stub
		//super(); default behaviour
		System.out.println("dog is created");
	}
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	void eat() {
		System.out.println("eating bread..");
	}
	
	void bark() {
		System.out.println("barking");
	}
	
	void work() {
		super.eat();
		bark();
	}

}
