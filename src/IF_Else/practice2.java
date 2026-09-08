package IF_Else;
//wap to take input and give its absolute value(negative ko positive)
import java.util.Scanner;

public class practice2 {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the integer:- ");
        int n=Sc.nextInt();
        if(n>=0){
            System.out.println(n);
        }
        else{
            System.out.println(-n);
        }
    }
}
