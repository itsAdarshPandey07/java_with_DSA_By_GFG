package BINARY_SEARCH;

public class kth_missingElementinsortedarray {
    public static int kthMissing(int[] arr, int tar) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int correctno = mid + 1;
            int missing = arr[mid] - correctno;
            if (missing >= tar) hi = mid - 1;
            else lo = mid + 1;
        }
        return hi + 1 + tar;
    }

    static void main() {
        int[] arr = {1, 4, 5, 6, 9, 10, 12, 13};
        int tar = 3;
        int result = kthMissing(arr, tar);
        System.out.println("the kth missing element is :"+result);
    }
}

