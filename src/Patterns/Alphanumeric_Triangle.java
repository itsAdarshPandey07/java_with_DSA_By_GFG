package Patterns;
import java.util.Scanner;
public class Alphanumeric_Triangle {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the value of n:-");
        int n=Sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i%2!=0)
                    System.out.print(j+" ");
                else
                    System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
