package LOOPs;
import java.util.Scanner;
//a raise to the power b
public class loop_practice13 {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter the a:-");
        int a= Sc.nextInt();
        System.out.print("enter b:-");
        int b= Sc.nextInt();
        int pow=1;
        for (int i =1; i <= b; i++) {
            pow*=a;
        }
        System.out.println(pow);
    }
}
