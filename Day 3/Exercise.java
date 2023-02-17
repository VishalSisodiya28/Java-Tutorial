
class BaseClass{

    void show(){
        System.out.println("Class Base");
    }
}

class DerivedClass extends BaseClass{

    @Override
    void show(){
        System.out.println("Class Derived");
        super.show();
    }
}

public class Exercise {
    public static void main(String[] args)  {
        
        DerivedClass d=new DerivedClass();
        d.show();
    }
}
