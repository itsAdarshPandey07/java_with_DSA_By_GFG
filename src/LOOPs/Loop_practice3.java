package LOOPs;

import java.util.Scanner;

//print no from n to 1 and n is input by user
public class Loop_practice3 {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the value of n:-");
        int n=Sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i+" ");

        }
    }
}
