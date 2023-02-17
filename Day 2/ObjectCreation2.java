import java.util.Scanner;
public class ObjectCreation2 {
    
    int x,y,z;
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        ObjectCreation2 obj =new ObjectCreation2();
       
        System.out.println("Enter three numbers : ");
        
        obj.x=sc.nextInt();
        obj.y=sc.nextInt();
        obj.z=sc.nextInt();

        System.out.println("Numbers are : "+obj.x+" "+obj.y+" "+obj.z);
        
        sc.close();
    }
}
