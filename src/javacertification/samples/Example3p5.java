package javacertification.samples;

enum Meal {

	BREAKFAST(7, 30), LUNCH(12, 15), DINNER(19, 45);

	private int hh;
	private int mm;

	Meal(int hh, int mm) {
		// TODO Auto-generated constructor stub
		assert (hh >= 0 && hh <= 23) : "illegal hour";
		assert (mm >= 0 && mm <= 59) : "illegal min";
		this.hh = hh;
		this.mm = mm;

	}

	public int getHour() {return this.hh;}
	public int getMins() {return this.mm;}

}

public class Example3p5 {
	
	public static void main(String[] args) {
		System.out.println("please note "+ Meal.BREAKFAST+ " "+ Meal.BREAKFAST.getHour());
		
		Meal[] meals = Meal.values();
		for(Meal meal:meals) {
			System.out.println("served as "+meal +" "+ meal.getHour()+ " "+meal.getMins());
		}
	}

}
