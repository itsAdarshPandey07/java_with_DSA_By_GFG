package Patterns;

import java.util.Scanner;

public class Double_flipped_triangle {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=n+1-i; k++) {
                System.out.print("* ");


            }
            System.out.println();

        }
    }
}


