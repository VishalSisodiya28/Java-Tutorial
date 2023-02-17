public class ThrowKeyword {
    
    void meth(){
       
        throw new NullPointerException("\nException !");
    }
    public static void main(String[] args) {
        
        ThrowKeyword obj=new ThrowKeyword();
        
        try{
            obj.meth();
        }
        catch(NullPointerException n){
            
           // System.out.println("Catch called !");
           // System.out.println(e.getMessage()); 
           
           throw n;
        }

        try{
            obj.meth();
        }
        catch(NullPointerException n2){
             
             System.out.println("Catch called !");
             System.out.println(n2.getMessage()); 
             
        }

    }
}
