package LOOPs;
import java.util.Scanner;
//break is used to stop or terminate the code if the required condition met.
//continue is used to skip the particular iteration.
//EXAMPLE:-wap to check if a given no is composite(more than 2 factor) or not.
public class Break_Statement {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n= Sc.nextInt();
        for (int i =2; i <n-i ; i++) {//yaha pr 1 to n isleye nhi  chL bez vo sabke factor hote hai all ready
            if (n % i == 0) {//i to n ka ek factor nikla
                System.out.println("given no is composite");
                break;

            }
        }

    }
}
