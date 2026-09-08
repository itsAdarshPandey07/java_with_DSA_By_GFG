package LOOPs;
import java.util.Scanner;
//WAP to sum of digits of a number.
public class Loop_practice10 {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter the number:-");
        int n = Sc.nextInt();
        int sum= 0;
        while (n != 0) {
            sum+=n % 10;//it gives the last digit of any number
            n/=10;//it is used to decrease the digits

        }
        System.out.println("sum of the digits is:-"+sum);
    }
}

