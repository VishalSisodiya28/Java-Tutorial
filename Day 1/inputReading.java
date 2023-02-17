import java.util.Scanner;
public class inputReading {
    public static void main(String[] args) {
        int i;
        String name;
        float f;
        double d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer : ");
        i=sc.nextInt();
        System.out.println("Enter a String : ");
        name=sc.next();
        System.out.println("Enter a Float : ");
        f=sc.nextFloat();
        System.out.println("Enter a Double :");

        d=sc.nextDouble();
        
        System.out.println();
        System.out.println(i);
        System.out.println(f);
        System.out.println(name);
        System.out.println(d);

        sc.close();

    }
}
