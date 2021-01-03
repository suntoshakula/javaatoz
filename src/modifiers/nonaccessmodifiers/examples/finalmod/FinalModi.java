package modifiers.nonaccessmodifiers.examples.finalmod;

public final class FinalModi {
	
	final int value=10;
	public static final int BOXWIDTH=6;
	static final String TITLE="manager";
	public void changeValue() {
		/*
		 error initialzing 
		value=12;
		BOXWIDTH=11;
		TITLE="here";
		*/
	}
	
	public final void changeName() {
		//body
	}

}
