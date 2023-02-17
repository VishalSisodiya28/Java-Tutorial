import java.util.Scanner;

class Base{
   
    String name;
    int age;

    void get_data(){

        Scanner sc=new Scanner(System.in);
        
        System.out.println("\nEnter your name : ");
        name=sc.nextLine();

        System.out.println("Enter your age : ");
        age=sc.nextInt();


    }
    void show_data(){
        System.out.println("\nYour name is : "+name);
        System.out.println("Your age is : "+age);

    }
}
class Derived extends Base{
 
    String email;

    void get_eid(){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your email : ");
        email=sc.nextLine();
    }
   
    void show_eid(){
       
        System.out.println("Your email is : "+email);

    }
}

public class Q2 {
    
    public static void main(String[] args) {
        Derived obj=new Derived();
        obj.get_data();
        obj.get_eid();
        obj.show_data();
        obj.show_eid();
    }
}
