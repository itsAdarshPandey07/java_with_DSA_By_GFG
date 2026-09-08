package Patterns;
import java.util.Scanner;
//Ques:-print the given pattern or rectangle
public class starRectangle {
    static void main() {
        Scanner Sc= new Scanner(System.in);
        System.out.print("enter the no of row:-");
        int row=Sc.nextInt();
        System.out.print("enter the no of column:-");
        int col=Sc.nextInt();
        for (int i = 1; i <=row ; i++) {//ye loop sirf no of line bata rha hai
            for (int j = 1; j <=col ; j++) {//ye loop indivisual line ke star print karega
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
