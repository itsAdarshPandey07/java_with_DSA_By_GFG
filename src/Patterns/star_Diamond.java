package Patterns;

import java.util.Scanner;

public class star_Diamond {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
        nsp = 1;
        nst = 2 * n - 3;
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("* ");
            }
            nsp++;
            nst -= 2;

            System.out.println();
        }
    }
    }
