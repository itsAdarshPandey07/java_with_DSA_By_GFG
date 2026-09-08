package Methods;
import java.util.Scanner;
//wap to max of three using function
public class MaxOfThreeNO {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the first no :-");
        int x=Sc.nextInt();
        System.out.print("enter the second no :-");
        int y=Sc.nextInt();
        System.out.print("enter the third no:-");
        int  z=Sc.nextInt();
        System.out.print("the greatest no is:");
        System.out.println(Math.max(Math.max(x,y),z));
       // System.out.println(Math.max(Math.max(Math.max(x,y),z),44));//this is for max of  four no


    }

    }
