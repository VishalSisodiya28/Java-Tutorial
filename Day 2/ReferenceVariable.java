public class ReferenceVariable {

    int x=10;
    public static void main(String[] args) {

        ReferenceVariable ref; // Reference variable
        ReferenceVariable obj=new ReferenceVariable();

        ref=obj;
        System.out.println("Value of x by Reference variable : "+ref.x);
        ref=null; //no error
        System.out.println("Value of x by Reference variable : "+ref.x);//prints nothing



    }
}
