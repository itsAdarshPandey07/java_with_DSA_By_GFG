package Patterns;

import java.util.Scanner;

public class Star_plus {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter value of n:-");
        int n=Sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i==n/2 +1||j==n/2+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
}
