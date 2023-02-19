import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        n = sc.nextInt();

        for (int i = 1; i < n; i++) {

            for (int j = 1; j <= n; j++) {

                if (j <= (n - i)) {
                    System.out.print(" ");
                }

                else {
                    System.out.print("*"); // to make it look like a pyramid give a space after * :)
                }

            }
            System.out.println();
        }

    }
}