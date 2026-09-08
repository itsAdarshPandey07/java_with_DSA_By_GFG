package Patterns;

import java.util.Scanner;

public class AlphabetSquare {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((char)(j+64)+" ");
//yaha par A=65 and a=97 ASCII value hote hai vahi hamne j+64 karke 65 laya fir typecast kar deya
            }
            System.out.println();

        }
    }
}
