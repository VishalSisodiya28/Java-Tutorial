import java.util.Scanner;
public class Constructor {

    int x;
   
    Constructor(){  //Default Constructor
        x=28;
        System.out.println("Value of x is : "+x);
    }

    Constructor(int x,int y) {  //Parameterized Constructor
        System.out.println("Sum is : "+(x+y));
    }
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        
        Constructor obj=new Constructor(); 

        System.out.println("Enter two numbers to add : ");
       
        n1=sc.nextInt();
        n2=sc.nextInt();
        
        Constructor obj2Constructor=new Constructor(n1,n2); 

       
    }
    
}
