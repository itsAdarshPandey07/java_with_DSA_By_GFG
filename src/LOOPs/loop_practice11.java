package LOOPs;
import java.util.Scanner;
//WAP reverse of a number
public class loop_practice11 {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter the number:-");
        int n = Sc.nextInt();
        int r = 0;
        while (n != 0) {
            r *= 10;
            r += (n % 10);
            n /= 10;
        }
        System.out.println(r);
    }
}