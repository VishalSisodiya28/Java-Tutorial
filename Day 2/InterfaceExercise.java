interface I1{
  
    void fun1();
}
interface I2 extends I1{
   
    void fun2();
}
interface I3 extends I2{
    
    void fun3();
}

public class InterfaceExercise implements I3 {

    public void fun1(){
        System.out.println("Fun 1");
    }

    public void fun2(){
        System.out.println("Fun 2");

    }
    public void fun3(){
        System.out.println("Fun 3");

    }
    public static void main(String[] args) {
       
        InterfaceExercise obj=new InterfaceExercise();
        obj.fun1();
        obj.fun2();
        obj.fun3();

    }
}
