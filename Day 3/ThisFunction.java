public class ThisFunction {

        ThisFunction(){
           
           System.out.println("I am a default Constructor !");
        }
        ThisFunction(int x){
            this();
            System.out.println("I am a parameterized Constructor !" +" "+x);
        }
        void display(){
        
            this.show();
        }
        
        void show(){
           System.out.println("I am show method !");
        }
    public static void main(String[] args) {
        //ThisFunction obj=new ThisFunction();
       // obj.display();

       ThisFunction obj=new ThisFunction(4);

    
    }
}
