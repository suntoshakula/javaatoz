package javacertification.samples;

public class Example3p15 {
	
	public static void main(String[] args) {
		
		int day = 1;
		String month = "march";
		int year = 2009;
		Object[] di = {day,month,year};
		
		/*
		flexp();
		flexp(day);
		flexp(day,month);
		flexp(day,month,year);
		
		System.out.println("******");
		flexp(di);
		flexp((Object)di);
		flexp(new Object[] {di});
		*/
		System.out.println("******");
		//flexp(args);
		//flexp((Object)args);
		flexp((Object[]) args);
		
		
		
		
		
	}

	private static void flexp(Object... data) {
		// TODO Auto-generated method stub
		System.out.println("type "+data.getClass().getName());
		System.out.println("no of elements "+data.length);
		
		System.out.println("elements");
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+ " ");
		if(data.length !=0)
			System.out.println();
	}
	
	private static void flexpo(Object... data) {
		// TODO Auto-generated method stub
		System.out.println("no of elements "+data.length);
		
		System.out.println("elements-oo");
		for(int i=0;i<data.length;i++)
			System.out.print("data " +data[i]+ " ");
		if(data.length !=0)
			System.out.println();
	}


}
