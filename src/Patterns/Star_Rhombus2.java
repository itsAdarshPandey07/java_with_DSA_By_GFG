package Patterns;

import java.util.Scanner;

//in this we break the rhombus into two part one is space another is square
public class Star_Rhombus2 {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");


            }
            System.out.println();

        }
    }
}


