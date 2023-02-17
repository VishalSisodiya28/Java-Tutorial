import java.util.Scanner;
public class Student {
    
    String name;
    int age;
    float cgpa;

    void getData(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("\nEnter your name : ");
        name=sc.nextLine();

        System.out.println("Enter your age : ");
        age=sc.nextInt();

        System.out.println("Enter you cgpa : ");
        cgpa=sc.nextFloat();

    }
    void showData(){

        System.out.println("\nYour name is : "+name);
        System.out.println("Your age is : "+age);
        System.out.println("Your CGPA is : "+cgpa);
    }
    public static void main(String[] args) {
        
       /*  Student obj=new Student();  //For Single object
        obj.getData();
        obj.showData(); */

        int n;
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter number of students : ");
        n=s.nextInt();
       
        Student obj[]=new Student[n]; // Array of Objects
       
        for(int i=0;i<n;i++){                 
            obj[i]=new Student(); 
            obj[i].getData();
            obj[i].showData();
        }


    }
}
