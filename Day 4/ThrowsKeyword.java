public class ThrowsKeyword  {
    
    void fun() throws NullPointerException,ArrayIndexOutOfBoundsException {
       
        System.out.println("Function called !");
        //throw new NullPointerException("\n\nNull pointer exception !");
       
    }
    public static void main(String[] args) {
        
        ThrowsKeyword obj=new ThrowsKeyword();
        obj.fun();

    }
}
