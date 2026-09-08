package LOOPs;
import java.util.Scanner;
//G-P:-An=a*r^n-1
//WAP to print gp 1,2,4,8,. n terms
public class loop_practice5 {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter value of n:");
        int n=Sc.nextInt();
        //using 'a' method 1
        int a=1,r=2;
       for (int i = 1; i <=n; i++) {
            System.out.println(a+" ");
            a*=r;
       }
        }

    }
