import java.util.Scanner;
public class if_else_calculator{

    public static void main(String[] args) {
        int n=0,a=0,b=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();


        System.out.println("\n1 for Addition");
        System.out.println("2 for Subtrcation");
        System.out.println("3 for Multiply");
        System.out.println("4 for Division");
        System.out.println("\nEnter you choice : ");
        n=sc.nextInt();

        System.out.println();
        if(n==1){

            System.out.println("Addition is : "+(a+b));

        }

      else  if(n==2){

            System.out.println("Subtraction is : "+(a-b));

        }
       else if(n==3){

            System.out.println("Multiplication is : "+(a*b));

        }
       else if(n==4){

            System.out.println("Division is : "+(a/b));

        }
        else{
            System.out.println("Wrong Input!!");
        }
        sc.close();

    }

}