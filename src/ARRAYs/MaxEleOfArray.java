package ARRAYs;
import java.util.Scanner;
public class MaxEleOfArray {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size:-");
        int x= sc.nextInt();
        int [] ARR=new int[x];
        int max=ARR[0];
      // int max=Integer.MIN_VALUE;//it fetch min value from the integer
        for (int i = 0; i < ARR.length ; i++) {
            ARR[i]= sc.nextInt();
        }
        System.out.println("Array is:-");
        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]+" ");
        }
        for (int i = 0; i <ARR.length ; i++) {
            if (ARR[i]>max)
                max=ARR[i];
        }
        System.out.println("MAx element of array is :-"+max);
    }
    }