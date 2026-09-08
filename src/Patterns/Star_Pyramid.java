package Patterns;
import java.util.Scanner;
//method1:-one loop for the star and another print 2i-1 star
public class Star_Pyramid {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("* ");


            }
            System.out.println();

        }
    }
}






