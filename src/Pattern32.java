import java.util.Scanner;

public class Pattern32Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            int f1 = 0; int f2 = 1;
            for (int j = 1; j <= i; j++) {
                int f3 = f1 + f2;
                System.out.print(f3 + " ");
                f1 = f2;
                f2 = f3;
            }
        System.out.println();
        }
    }
}