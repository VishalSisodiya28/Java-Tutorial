import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int arr[]=new int[5];
        int n;
        
        System.out.print("How many elements ? : ");
        n=sc.nextInt();

        try{
            
            System.out.print("Enter Elements : ");
            
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            System.out.print("Your Array : ");

            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
        
        catch(Exception e){
            System.out.println("Array ke size se out of bound hai !");
        }
        
    }
}
