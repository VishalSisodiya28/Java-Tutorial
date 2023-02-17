
interface i1{
 
    //declaration of abstract method
    void fun1(); //automatically adds abstract keyword 
    
    //all variables all Final in interface
}

public class Interfaces implements i1 {  //interface is implemented 
    
    //Overriding a method of interface requires it to be defined publically in implemented class
    
    public void fun1() {
        System.out.println("Hello !!!");
        
    }
    public static void main(String[] args) {
        Interfaces obj=new Interfaces(); 
        obj.fun1();
    }
}
