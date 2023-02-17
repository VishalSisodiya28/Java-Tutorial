interface I1{
void show();
}
class C1 implements I1{
 
    String name="Vishal Sisodiya";

     public void show() {
     
           System.out.println("Name is : "+name);
     }
}

class C2 implements I1{
 
    int age=19;
 
       public void show() {
     
        System.out.println("Age is : "+age);
     
      }
 
}

class C3 implements I1{
   
    String email="vishal3330a@gmail.com";
   
    public void show() {
      
        System.out.println("Email is : "+email);
        
    }

}

public class Exercise2 {
    public static void main(String[] args) {
        
        C1 obj=new C1();
        C2 obj2=new C2();
        C3 obj3=new C3();
        
        obj.show();
        obj2.show();
        obj3.show();


    }

}
