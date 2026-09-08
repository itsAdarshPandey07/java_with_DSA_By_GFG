package Methods;

import java.util.Scanner;

public class SwapTOnum {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the value of a:-");
        int a= Sc.nextInt();
        System.out.print("enter the value of b:-");
        int b= Sc.nextInt();
        System.out.print("the given no are:-");
        System.out.println(a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:-");
        System.out.println(a+" "+b);
    }
}
