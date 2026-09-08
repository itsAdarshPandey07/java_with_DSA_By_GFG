package ARRAYs;
import java.util.Scanner;
public class SecondMaxArray {
    static void main() {
        int[]arr={23,25,45,66,77};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        //calculate maximum
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max)
                max=arr[i];
        }
        //calculate second max
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>secondMax && arr[i]!=max)
                secondMax=arr[i];
        }
        System.out.println("the max element of array is :-"+max);
        System.out.print("the second max element of array is :-"+secondMax);
    }
}

