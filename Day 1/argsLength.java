public class argsLength {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        System.out.println("Hello");
        System.out.println(args.length);
        args[0] = "Vishal";
        System.out.println(args[0]);
    }
}
