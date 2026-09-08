package Patterns;
import java.util.Scanner;

public class Alphabet_triangle {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(j+64)+" ");

            }
            System.out.println();
        }
    }
}
