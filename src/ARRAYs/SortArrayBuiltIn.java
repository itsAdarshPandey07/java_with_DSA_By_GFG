package ARRAYs;
import java.util.Arrays;
public class SortArrayBuiltIn {
    static void main() {
//sort-ascending order
        int []arr={ 12,1,2,3,4,5,6,-9};
        print(arr);
        Arrays.sort(arr);//it is used to sort the array
        print(arr);
    }
    public static void print(int []arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
