package ARRAYs;
import java.util.Scanner;
public class SumOfElementofArray {
    static void main() {
        int Sum = 0;
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter the size of Array:-");
        int x = Sc.nextInt();//first it ask for the size of array
        System.out.print("enter the Array element:-");
        int[] arr = new int[x];//it ask element of array
        for (int i = 0; i < x; i++) {
            arr[i] = Sc.nextInt();//printing the element of array
        }
        for (int i = 0; i < x; i++) {
            System.out.println(" Array is:-" + arr[i] + " ");//output of the array
        }
        for (int i = 0; i < x; i++) {
            Sum += arr[i];
    }
        System.out.println("sum of array is :-"+Sum);
    }
}
