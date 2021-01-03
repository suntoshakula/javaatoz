package generic.type;

public class GenericMain {
	
	public static<T> void printArray(T[] inputarry) {
		for(T ele:inputarry) {
			System.out.printf("%s ",ele);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Integer[] intarray = {1,2,3,4,5};
		Double[] doubarray = {1.1,2.2,3.3};
		System.out.println("array integer");
		printArray(intarray);
		System.out.println("double integer");
		printArray(doubarray);
	}

}
