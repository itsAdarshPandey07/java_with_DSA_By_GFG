package Patterns;

import java.util.Scanner;

public class AlphabetSquare3 {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        int n=Sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i%2==0)
                    System.out.print((char)(i+64)+" ");
                else
                    System.out.print((char)(i+96)+" ");
            }
            System.out.println();

        }

    }
}

