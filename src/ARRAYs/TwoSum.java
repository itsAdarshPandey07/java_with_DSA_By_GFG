package ARRAYs;
public class TwoSum {
    static void main() {
        int[] arr = {12, 1, 4, 18, 2, 16};
        int target = 125;
         boolean result=TwoSum(arr, target);

        System.out.println(result);

    }
   public static boolean TwoSum(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    return true;

            }
        }
        return false;
    }
}
