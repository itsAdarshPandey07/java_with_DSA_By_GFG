package Patterns;

import java.util.Scanner;

//method 2:-declare nsp and nst and decrease nsp by 1 and increase nst by22
public class Star_pyramid2 {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int nsp=n-1;
        int nst=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=nst; k++) {
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}


