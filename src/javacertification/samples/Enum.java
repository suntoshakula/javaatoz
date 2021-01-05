package javacertification.samples;

public class Enum {
	public enum CardSuid {
		HEARTS, SPADES, CLUBS, DIAMOND
	}

	public static void main(String[] args) {
		
		CardSuid hearts = CardSuid.HEARTS;
		System.out.println("the suit is "+hearts);
		//100

	}
}
