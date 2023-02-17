import java.util.Scanner;
public class ExceptionExercise {
    
    public static void main(String[] args) {
        int a,b,c,d,f,g,h;
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter three positive integers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        System.out.println("Enter two positive integers : ");
        d=sc.nextInt();
        f=sc.nextInt();
        
        g=a+b+c;

        System.out.println("Numerator is : "+g);
        h=d-f;
        System.out.println("Denominator is : "+h);

        try{
            if(h<=0){
                throw new ArithmeticException("Denominator cannot be zero !");
            }

            else{
                System.out.println("Solution of expression is : "+g/h);
            }

        }
        catch(ArithmeticException obj){
            System.out.println("got Exception !!");
             System.out.println(obj.getMessage());

        }
    }
}
