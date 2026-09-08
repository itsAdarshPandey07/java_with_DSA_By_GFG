package ARRAYs;
import java.util.Scanner;
public class MinEleOfArray {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size:-");
        int x= sc.nextInt();
        int [] ARR=new int[x];
        //int min=Integer.MAX_VALUE;//it fetch max value from the integer
        for (int i = 0; i < ARR.length ; i++) {
            ARR[i]= sc.nextInt();
        }
        int min=ARR[0];
        System.out.println("Array is:-");
        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]+" ");
        }
        for (int i = 0; i <ARR.length ; i++) {
            if (ARR[i]<min)
                min=ARR[i];
        }
        System.out.println("Min element of array is :-"+min);
    }
}
