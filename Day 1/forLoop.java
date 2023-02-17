import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
        int a=0;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=10;i++){
            a=sc.nextInt();
        }
       System.out.println("Final Value of a is "+a);
       sc.close();
    }
     
}
