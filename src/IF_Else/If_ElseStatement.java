package IF_Else;
import java.util.Scanner;

//if statement run when true otherwise else will run
// Question:- Take positive integer input and tell if is it odd or even
public class If_ElseStatement {
    static void main() {
       Scanner Sc = new Scanner(System.in);
        System.out.println("enter the value of +ve integer:-");
        int a = Sc.nextInt();
        if (a % 2== 0) {
            System.out.print(a+" ");
            System.out.println(" is even");
        } else {
            System.out.print(a);
            System.out.println("is odd");
        }
    }
}
