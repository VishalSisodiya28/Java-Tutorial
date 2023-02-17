class Demo{  //Superclass

     void fun(){
        System.out.println("Hello !!");
    }
}

public class SingleInheritance extends Demo {  //Subclass
    public static void main(String[] args) {
        SingleInheritance obj=new SingleInheritance();
        obj.fun();
    }
}
