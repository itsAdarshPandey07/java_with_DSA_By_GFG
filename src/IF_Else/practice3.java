package IF_Else;
import java.util.Scanner;

//ques:take real no input and check if it is an integer or not
public class practice3 {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter the real no:-");
        double n=Sc.nextDouble();
        int x =(int)n;//typecasting double to int here
        if(n-x==0){
            System.out.println("Is  an Integer");
        }
        else{
            System.out.println("Is not an Integer");
        }
    }
}
