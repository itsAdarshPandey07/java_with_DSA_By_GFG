package ARRAYs;
import java.util.Arrays;
public class ShallowCopyDeepCopy {
    static void main() {
        int[]arr={12,14,3,14,15};
        //int[]x=arr;//x is shallow copy of arr(mtlb dono same hai)
       // x[0]=123;
       int[] deep= Arrays.copyOf(arr,arr.length);//deep copy means it create new array
       deep[0]=123;
        System.out.println(arr[0]);
        System.out.println(deep[0]);
    }
}
