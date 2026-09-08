package Patterns;

import java.util.Scanner;

public class AlphabetTRianglehorizontallyFlipped {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        int n= Sc.nextInt();
        for (int i = 1; i <=n ; i++) {
        for (int j = 1; j <=n+1-i ; j++) {
            System.out.print((char)(j+96)+" ");

        }
            System.out.println();

        }
    }
}
