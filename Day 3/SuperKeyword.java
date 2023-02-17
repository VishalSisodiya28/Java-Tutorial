class SuperClass{
    int x;
}

public class SuperKeyword extends SuperClass {

    int x;
    void show(){
        
        super.x=10;
        x=20;
        System.out.println("Super class' x : "+super.x);
        System.out.println("Sub class' x : "+x);

    }
    public static void main(String[] args) {
        SuperKeyword obj=new SuperKeyword();
        obj.show();
    }
}
