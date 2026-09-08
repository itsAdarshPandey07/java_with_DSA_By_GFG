package Patterns;

import java.util.Scanner;

public class AlphabetTRIVERflipped {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for (int i =1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {//for printing the space triangle
                System.out.print("  ");

            }
            for (int j =1; j <=i ; j++) {//star loop
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();

        }
    }
}



