package IF_Else;
//&& and -and:-it is used when both condition is true
//|| or- or:-it is used when anyone of the condition is true
//logic in this question that we have to set the priority of the conditions
import java.util.Scanner;

public class Practice5 {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the value of +ve integer:-");
        int x=Sc.nextInt();
        if (x%5==0 && x%3==0) {
            System.out.println("divisible by both 5 and 3");
        }
        else if(x%5==0){
            System.out.println("divisible by 5");
        } else if (x%3==0) {
            System.out.println("divisible by 3");
        } else {
            System.out.println("not divisible by both 5 and 3");

        }
    }
}
