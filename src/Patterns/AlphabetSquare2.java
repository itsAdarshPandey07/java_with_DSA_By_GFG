package Patterns;

import java.util.Scanner;

public class AlphabetSquare2 {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        int n=Sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {

                    System.out.print((char)(i+64)+" ");

            }
            System.out.println();

        }

    }
}
