package LOOPs;
import java.util.Scanner;
//WAP of factorial no
public class loop_practice12 {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter the number:-");
        int n = Sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
    }

