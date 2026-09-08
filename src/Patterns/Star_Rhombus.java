package Patterns;
import java.util.Scanner;
public class Star_Rhombus {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {//for the invert space triangle
                System.out.print("  ");

            }
            for (int k = 1; k <= i; k++) {//for the star
                System.out.print("* ");
            }
            for (int l = 1; l < n+1- i; l++) {//for the invert star
                System.out.print("* ");


            }
            System.out.println();

        }

    }

}