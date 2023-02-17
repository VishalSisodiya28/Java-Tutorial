abstract class DemoAbstract{
   
    abstract void fun1();

    void fun2(){
        System.out.println("fun2() called !");
    }
}

public class AbstractClass extends DemoAbstract {

    //Overriding fun1()
    void fun1() {
        System.out.println("Overridden method fun1()");
    }
    public static void main(String[] args) {
        
        AbstractClass obj =new AbstractClass();
        obj.fun1();
        obj.fun2();
    }
    
}
