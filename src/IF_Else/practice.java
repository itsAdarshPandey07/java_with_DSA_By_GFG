/*/package basic_of_java;
//1)take 3 no i/p and print their sum
import java.util.Scanner;
public class practice {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first no:-");
        double a=sc.nextDouble();
        System.out.print("enter the second no:-");
        double b= sc.nextDouble();
        System.out.print("enter the third no:-");
        double c=sc.nextDouble();
        double sum=a+b+c;
        System.out.print("the sum is:-");
        System.out.println(sum);

    }
}/*/
//2)wap to find the simple interest(si=p+r+t/100)
package IF_Else;
import java.util.Scanner;

public class practice {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of principle:");
        double prncple=sc.nextDouble();
        System.out.print("enter the value of rate :");
        double rate=sc.nextDouble();
        System.out.print("enter the value of interest:");
        double intrest=sc.nextDouble();
         double S_I=(prncple+rate+intrest)/100;
        System.out.println("Simple interest is:- ");
        System.out.println(S_I);

    }
    }


