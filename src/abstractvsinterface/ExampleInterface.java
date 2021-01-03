package abstractvsinterface;
//first interface
interface ExampleInterface1{
    public void display1();
}
//second interface
interface ExampleInterface2 {
    public void display2();
    public static void initDisplay2() {
    	System.out.println("display2 method");
    }
    abstract void initDisplay2a(); 
    public default void display2aa() {
    	System.out.println("display2aa method");    	
    }
}
//This interface is extending both the above interfaces
interface ExampleInterface3 extends ExampleInterface1,ExampleInterface2{
}
class ExampleInterface4 implements ExampleInterface3{
    public void display1(){
        System.out.println("display2 method");
    }
    public void display2(){
        System.out.println("display3 method");
    }
    /*should contains all declared methods*/
	@Override
	public void initDisplay2a() {
		// TODO Auto-generated method stub	
		System.out.println("over ridding new information");
	}
	
	public void initDisplay2() {
		System.out.println("hi this is over ridden here");
	}
}