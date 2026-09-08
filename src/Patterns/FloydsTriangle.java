package Patterns;

import java.util.Scanner;

public class FloydsTriangle {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the value of n:-");
        int n=Sc.nextInt();
        int a=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(a+" ");//Add a additional a var that increase by 1
                a++;//increase till last condition
            }
            System.out.println();
        }

    }
}
