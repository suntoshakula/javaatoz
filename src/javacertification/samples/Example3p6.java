package javacertification.samples;

enum Day{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum Meal2{
	BREAKFAST(7,30){
		
		public double mealPrice(Day day) {
			double bfPrice = 10.50;
			if(day.equals(Day.SATURDAY )|| day == Day.SUNDAY)
				bfPrice *=1.5;
			return bfPrice;
		}
		public String toString() {
			return "Breakfast";
		}
		
	},
	
	DINNER(19,45){
		public double mealPrice(Day day) {
			double dfPrice = 25.50;
			if(day.compareTo(Day.SATURDAY) >=0 &&  day.compareTo(Day.SUNDAY) <= 0)
				dfPrice *=2.5;
			return dfPrice;
		}
	};
	
	abstract double mealPrice(Day day);
	private int hh;
	private int mm;

	Meal2(int hh, int mm) {
		// TODO Auto-generated constructor stub
		assert (hh >=0 && hh <=23): "illegal hour.";
		assert (mm >=0 && mm <=59): "illegal min.";
		this.hh = hh;
		this.mm = mm;
	}
	
	public int getHour() {return this.hh;}
	public int getMins() {return this.mm;}
	
	
}
public class Example3p6 {
	
	public static void main(String[] args) {
		System.out.println("enum: "+" "+ Meal2.BREAKFAST.name()+ " "
				+ Meal.BREAKFAST.getHour()
				+ " "
				+ Day.MONDAY
				+ " "
				+ Meal2.BREAKFAST.mealPrice(Day.MONDAY)
				);
	
	Meal2[] meals = Meal2.values();
	for(Meal2 meal: meals) {
		
		System.out.println(meal +" " + meal.mealPrice(Day.SATURDAY));
		
	}
	}
	

}
