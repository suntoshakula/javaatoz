package abstractvsinterface;
class DemoExampleInterface1{
    public static void main(String args[]){
        Example4 obj=new Example4();
        ExampleInterface4 obj2 = new ExampleInterface4();
        obj.display1();
        obj.abstractDisplay2();
        obj.display3();
        
        obj2.display1();
        obj2.display2();
        obj2.display2aa();
        obj2.initDisplay2();
        obj2.initDisplay2a();
    }
}