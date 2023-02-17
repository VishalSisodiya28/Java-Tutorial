import java.util.Scanner;
public class switch_calculator {
  


    public static void main(String[] args) {
        int n,a,b;
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
       
         switch(n){
            case 1: System.out.println("Addition is : "+(a+b));
                    break;
            case 2: System.out.println("Subtraction is : "+(a-b));
                    break;
            case 3: System.out.println("Multiplication is : "+(a*b));
                    break;
            case 4: System.out.println("Division is : "+(a/b));
                    break;
            default:System.out.println("Wrong Input!!");
         }

         sc.close();

    }

}

