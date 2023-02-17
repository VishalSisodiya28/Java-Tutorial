 class BaseClass{

    void show(){
        System.out.println("Class Base");
    }
}

class DerivedClass extends BaseClass{

    void show(){
        System.out.println("Class Derived");
    }
}

public class Exercise2 {
    public static void main(String[] args)  {
        
        DerivedClass d=new DerivedClass();
        d.show();
       
        BaseClass b;
        b=d;
        b.show();
        
       /* BaseClass b2=new BaseClass();
        DerivedClass d2;
        b2=d2;
        b2.show();
         */
       
       

      
    }
}
