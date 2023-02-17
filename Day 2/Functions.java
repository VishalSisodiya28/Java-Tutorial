import java.util.Scanner;
public class Functions {
    
    void greet(){
        System.out.println("Hello!!");
    }

    int fun(int x,int y){

        return (x*y);
    }
   
    public static void main(String[] args) {
      
        int a,b;

        Functions obj=new Functions();
        Scanner sc=new Scanner(System.in);

        obj.greet();
        
        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();


        System.out.println( "multiplication is : "+obj.fun(a,b));
    }
}
