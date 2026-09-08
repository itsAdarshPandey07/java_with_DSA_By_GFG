package Patterns;
import java.util.Scanner;
public class Star_triangle {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the value of n:-");
        int n=Sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();

        }
    }

}
