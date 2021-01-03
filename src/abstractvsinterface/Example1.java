package abstractvsinterface;
class AbsExample1{
   public void display1(){
      System.out.println("display1 method");
   }
}
abstract class Example2{
   public void display2(){
      System.out.println("display2 method");
   }
   protected void display2a() {
	   System.out.println("display2a method");
   }
   private void display2aa() {
	   System.out.println("display2aa method");
   }
   abstract void abstractDisplay2();
}
abstract class Example3 extends AbsExample1{
   abstract void display3();
}
class Example4 extends Example3{
   public void display3(){
      System.out.println("extened display3 method");
   }
   public void abstractDisplay2() {
	   System.out.println("extened abstractDisplay2");
   }
}

