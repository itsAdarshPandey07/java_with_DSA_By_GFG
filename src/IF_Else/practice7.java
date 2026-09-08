package IF_Else;
import java.util.Scanner;

//Ques:-wap to tell if they can be side of the triangle or not
//concept:-for triangle sides are=a+b>c,b+c>a,c+a>b
public class practice7 {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the first integer:");
        int a=Sc.nextInt();
        System.out.print("enter the second integer");
        int b=Sc.nextInt();
        System.out.print("enter the third integer");
        int c=Sc.nextInt();
        if(a+b>c&&b+c>a&&c+a>b){
            System.out.println("Valid triangle");
        }
        else {
            System.out.println("invalid triangle");
        }
    }
}
