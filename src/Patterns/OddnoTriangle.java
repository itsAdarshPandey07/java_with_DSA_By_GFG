package Patterns;

import java.util.Scanner;

public class OddnoTriangle {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for (int i = 1; i <=n; i++) {
            int a=1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(a+" ");
                 a+=2;
            }
            System.out.println();
        }
    }
}
