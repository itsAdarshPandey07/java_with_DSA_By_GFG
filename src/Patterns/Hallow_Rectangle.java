package Patterns;

import java.util.Scanner;

public class Hallow_Rectangle {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the row value:-");
        int row=Sc.nextInt();
        System.out.print("enter the column value:-");
        int col=Sc.nextInt();
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                if(i==1||i==row||j==1||j==col)
                 System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
}
