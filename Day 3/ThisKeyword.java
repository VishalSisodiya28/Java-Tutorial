public class ThisKeyword {

    int x;
    int y=20;

    void meth(){
        
        int x=1,y=2;
        this.x=10;
        System.out.println("Without This : "+x +" "+y);
        System.out.println("With This :"+this.x+" "+this.y);
    }

    void meth2(int x,int y){
        this.x=x;
        this.y=y;

        System.out.println("By giving parameters : "+this.x+" "+this.y);
    }
    public static void main(String[] args) {
        
        ThisKeyword obj=new ThisKeyword();
        obj.meth();
        obj.meth2(8,5);
    }
}
