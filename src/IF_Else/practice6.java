package IF_Else;
import java.util.Scanner;

//Ques:-take a positive integer and tell if it is 4 digit num or not
public class practice6 {
    static void main() {
        Scanner Sc= new Scanner(System.in);
        System.out.print("enter the +ve integer:-");
        int n=Sc.nextInt();
        if(n>999&&n<=9999){
            System.out.println("It is a 4 digit number");
        }else {
            System.out.println("It is not a 4 digit number");
        }

    }
}
