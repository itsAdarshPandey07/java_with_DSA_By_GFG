package IF_Else;
import java.util.Scanner;

//Ques:-give CP and SP of an item is input ,wap to determine profit,loss or no profit no loss
public class practice4 {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the cost price:-");
        double C_P=Sc.nextDouble();
        System.out.print("enter the selling price:-");
        double S_P=Sc.nextDouble();
        if(S_P>C_P){
            double profit=S_P-C_P;
            System.out.println("The Seller has made profit of:-"+profit);
        } else if (C_P==S_P) {//if ke andar IF ko else If bola jata hai
            System.out.println("The Seller has made no profit no loss");
        }
        else{
           double loss=C_P-S_P;
            System.out.println("The Seller has made loss of:-"+loss);
        }

    }
}
