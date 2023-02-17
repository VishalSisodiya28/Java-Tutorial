class SuperClass2{
    SuperClass2(){
        System.out.println("Constructor of Super Class");
    }
    void meth(){
        System.out.println("Method of Super Class");
    }
}

public class SuperFunction extends SuperClass2{

    SuperFunction(){
        super();
    }
    void show(){
        super.meth();
    }
    public static void main(String[] args) {
        SuperFunction obj=new SuperFunction();
        obj.show();
    }
}
