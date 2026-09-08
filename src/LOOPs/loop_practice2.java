package LOOPs;
import java.util.Scanner;
//WAP of table of n
public class loop_practice2 {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the value of n:-");
        int n=Sc.nextInt();
        System.out.println("the table of 17 is:-");
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i*n+" ");
            
        }
    }
}
