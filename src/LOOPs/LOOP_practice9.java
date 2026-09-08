package LOOPs;
import java.util.Scanner;
//WAP to count the digits of a number
public class LOOP_practice9 {
    static void main() {
     Scanner Sc=new Scanner(System.in);
        System.out.print("enter the number");
        int num=Sc.nextInt();
        if (num==0)//used for 0 bez it is 1 digit number
            num=1;
        int count=0;
        while(num!=0){//jabtk n=0 nhi hoga tb tk run hoga
            num/=10;
            count++;

        }

        System.out.println(count);


    }
}
