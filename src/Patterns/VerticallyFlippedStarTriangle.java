package Patterns;
import java.util.Scanner;
//method:-1 in this method be take it as a square and then find that * print when i+j>4
public class VerticallyFlippedStarTriangle {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j =1; j <=n ; j++) {
                if (i+j>4)
                    System.out.print("*"+" ");
                else
                    System.out.print("  ");

            }
            System.out.println();

        }
    }
}
