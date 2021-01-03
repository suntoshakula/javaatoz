package generic.type;

public class GenericClass<T>{
	private T t;
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public static void main(String[] args) {
		GenericClass<Integer>  ib = new GenericClass<Integer>();
		GenericClass<String	>  b = new GenericClass<String>();
		ib.add(new Integer(10));
		b.add("Santosh");
		System.out.printf("integer %d\n", ib.get());
		System.out.printf("string %s\n", b.get());
	}

}
