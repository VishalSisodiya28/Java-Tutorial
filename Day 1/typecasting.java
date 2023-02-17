public class typecasting {
    
    public static void main(String[] args) {
       //implicit typecasting
       
        byte x=10;
        int y;
        y=x; //  widening
        System.out.println("Widenening : "+y); 
        
        //explicit typecasting

         int n=20;
         byte b;
         b=(byte)n; //narrowing
         System.out.println("Narrowing : "+b);

    }
}
