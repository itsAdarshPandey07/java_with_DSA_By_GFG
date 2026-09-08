package Patterns;
import java.util.Scanner;

public class BRIDGE {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");

        }
        System.out.println();
        int nsp=1;
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n  - i; j++) {
                System.out.print("*"+" ");

        }

            for (int j = 1; j <= nsp; j++) {
                System.out.print(" "+" ");
            }
            for (int k = 1; k <= n-i; k++) {
                System.out.print("*"+" ");
            }
            nsp += 2;
            System.out.println();

        }
    }
}

