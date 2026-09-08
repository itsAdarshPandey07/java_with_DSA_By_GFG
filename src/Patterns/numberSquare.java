package Patterns;

import java.util.Scanner;

public class numberSquare {
    static void main() {
        Scanner Sc= new Scanner(System.in);
        System.out.print("enter the value of n:-");
        int n=Sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j+" " );
            }
            System.out.println();

        }
    }
}
