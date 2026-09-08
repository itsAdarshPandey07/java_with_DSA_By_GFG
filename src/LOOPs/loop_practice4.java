package LOOPs;
import java.util.Scanner;
//WAp to display ap 2,5,8,11.... n term
//an=a+(n-1)d
//sn=n/2[2a+(n-1)d]
public class loop_practice4 {
    static void main() {
        Scanner Sc =new Scanner(System.in);
        System.out.print("enter the value of n:-");
        int n=Sc.nextInt();
        for (int i =2; i <=3*n-1 ; i+=3) {//with the help of nth term ap formula
           System.out.print(i+" ");
           //or a=a+d by initialising a and d before loop
       // int a=2,d=3;
       // for (int i = 1; i <=n ; i++) {
           // System.out.print(a+" ");
         //   a+=d;

        }
        }

    }

