import java.util.Scanner;
 
/* 
class ExceptionHandling{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x=10;
        int y=2;

        int n=sc.nextInt();


        try{
            System.out.println(10/n);
        }
        catch(Exception ob){
            
            System.out.println("Zero se divide undefined hai !");
        }
       
    }
}
*/
class ExceptionHandling {
    public static void main(String[] args) throws ArithmeticException {

        Scanner sc=new Scanner(System.in);
        int x=10;
        int y=2;

        int n=sc.nextInt();

         System.out.println(10/n);
        
      
       
    }
}