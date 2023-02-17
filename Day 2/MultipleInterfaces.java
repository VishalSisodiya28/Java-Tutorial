interface I1{
    void fun1();
}
interface I2{
    void fun2();
    void fun3();
}
public class MultipleInterfaces implements I1,I2 {

    public void fun1(){
   
        System.out.println("Function 1");
    }
   
    public void fun2(){
    
        System.out.println("Function 2");

    }
   public void fun3(){
   
        System.out.println("Function 3");


    }
    public static void main(String[] args) {
        MultipleInterfaces obj=new MultipleInterfaces();
        obj.fun1();
        obj.fun2();
        obj.fun3();

    }
    
}
