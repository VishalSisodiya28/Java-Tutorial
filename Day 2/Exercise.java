interface I1{
    
    void fun1();
}
abstract class AbClass implements I1{
    
    abstract void fun2();
    
    public void fun1(){
       
        System.out.println("Fun 1");
    }
}
 class Exercise extends AbClass {

    void fun2(){
        
        System.out.println("Fun 2");
    }
    public static void main(String[] args) {
        
        Exercise obj=new Exercise();
        obj.fun1();
        obj.fun2();
    }
    
}
