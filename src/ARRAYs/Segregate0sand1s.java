package ARRAYs;
import java.util.Arrays;
//this type of solution is called two pass solution.
public class Segregate0sand1s {
    static void main() {
        int[] arr = {1, 1, 0, 1, 0, 0, 1, 1, 0};
        int n = arr.length;
        int noofzeros = 0;
        //count no of 0s and 1s
        for (int ele : arr) {
            if (ele == 0)
                noofzeros++;
        }
        //print 0s first
        for (int i = 0; i < noofzeros; i++) {
            arr[i] = 0;

        }
        //print 1s after 0s
        for (int i = noofzeros; i <n; i++) {
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
        }

    }
