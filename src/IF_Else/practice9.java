package IF_Else;
import java.util.Scanner;

//Ques:-WAP of greatest of three number
public class practice9 {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the first no:-");
        int a=Sc.nextInt();
        System.out.print("enter the second no:-");
        int b=Sc.nextInt();
        System.out.print("enter the third no:-");
        int c=Sc.nextInt();
        if(a>b&&a>c){
            System.out.println("a is greatest");
        } else if (b>a&&b>c) {
            System.out.println("b is greatest");
        }else{
            System.out.println("c is greatest");
        }


    }
}
