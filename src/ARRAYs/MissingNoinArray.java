package ARRAYs;

public class MissingNoinArray {
    static void main() {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(MissingNum(arr) + " ");
    }

    public static int MissingNum(int arr[]) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int Arraysum = 0;
        for (int ele : arr) {
            Arraysum += ele;
        }
        return sum - Arraysum;
    }
}

