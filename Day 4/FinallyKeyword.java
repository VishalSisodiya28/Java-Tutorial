import java.util.Scanner;

public class FinallyKeyword {
   
    public static void main(String[] args) {
       
        int arr[]={1,2,3,4,5};
        int n;
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter index : ");
        n=sc.nextInt();
         
        try{
            System.out.println("number is : "+arr[n]);
        }

        catch(ArrayIndexOutOfBoundsException ob){
            System.out.println("Array index is out of bound !");
        }
        
        finally // always executed
        {
            System.out.println("Finally executed !");  
        }
    }
}
