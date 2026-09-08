package LOOPs;

import java.util.Scanner;

//wap to find given no is prime or not
public class loop_practice8 {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n= Sc.nextInt();
        boolean flag=true;//true means prime
        for (int i = 2; i <=n-i ; i++) {
            if (n %i == 0) {
                flag = false;//false means composite
                break;
            }
        }   if(n==1) System.out.println("neither prime or composite");
            else if (flag==false) System.out.println("composite number");
            else  System.out.println("prime number");
            
        }
    }

