package IF_Else;

import java.util.Scanner;

//ternary operator:-it is basically shortest form of if else
//condition?sach:jhoot
//ex:-no is even or odd
public class Ternary_Operator {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the value:-");
        int n=Sc.nextInt();
        System.out.println(n%2==0?"even":"odd");
    }
}
