package interfaces;

class DemoInterfaces implements MyInterface
{
   /* This class must have to implement both the abstract methods
    * else you will get compilation error
    * 
    */
	int x = 100;
   public void method1()
   {
	System.out.println("implementation of method1");
   }
   public void method2()
   {
	System.out.println("implementation of method2");
   }
   public static void main(String arg[])
   {
	MyInterface obj = new DemoInterfaces();
	obj.method1();	
	System.out.println(obj.x);
   }
}