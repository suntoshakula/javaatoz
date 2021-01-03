package modifiers.nonaccessmodifiers.examples.staticmod;

public class StaticClass {
	private static int numInstances = 0;

	protected static int getCount() {
		return numInstances;
	}

	private static void addInstance() {
		numInstances++;
	}

	StaticClass() {
		StaticClass.addInstance();
	}

	public static void main(String[] args) {
		System.out.println("starting with " + StaticClass.getCount() + " instances");

		for (int i = 0; i < 500; i++) {
			new StaticClass();
		}
		System.out.println("created "+ StaticClass.getCount() + " instances");
	}

}
