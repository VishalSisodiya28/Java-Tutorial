import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] arr=new int[10];
        System.out.println("Enter 10 elements : ");
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       
        System.out.println("Elements are : ");
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
