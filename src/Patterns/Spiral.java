package Patterns;

import java.util.Scanner;

public class Spiral {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for (int i = 1; i <=2*n-1 ; i++) {
            for (int j =1; j <=2*n-1 ; j++) {
                int a=i,b=j;
                if (i>n) a=2*n-i;
                if( j>n) b=2*n-j;
                System.out.print(Math.min(a,b)+" ");

            }
            System.out.println();

        }
    }
}
