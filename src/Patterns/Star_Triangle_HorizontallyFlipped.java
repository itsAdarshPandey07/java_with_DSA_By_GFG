package Patterns;
import java.util.Scanner;

public class Star_Triangle_HorizontallyFlipped {
    static void main() {
        Scanner SC =new Scanner(System.in);
        System.out.print("enter the value of n:-");
        int n=SC.nextInt();
        //for (int i =n; i>=1; i--) {//for the reverse num triangle
            //for (int j = i; j >=1 ; j--)
        for (int i =1; i <=n ; i++) {
            for (int j =1; j <=n+1-i ; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();
        }
    }
}
