package BINARY_SEARCH;

public class FirstandLastOccurance {
    public static int firstSearch(int[] arr, int k) {
        int lo = 0, hi = arr.length - 1, idx = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > k) hi = mid - 1;
            else if (arr[mid] < k) lo = mid + 1;
            else {
                idx = mid;
                hi = mid - 1;//this give the first occurrence
                // lo=mid+1; if we put this we get last occurrence
            }
        }
        return idx;
    }

    public static int lastSearch(int[] arr, int k) {
        int lo = 0;
        int hi = arr.length - 1;
        int idx = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > k) hi = mid - 1;
            else if (arr[mid] < k) lo = mid + 1;
            else {
                idx = mid;
                lo = mid + 1;//this give the first occurrence
                // lo=mid+1; if we put this we get last occurrence
            }
        }
        return idx;
    }

    static void main() {
        int[] arr = {12, 12, 14, 15, 16, 17, 18, 19, 19, 19};
        int k = 19;
        int result1 = firstSearch(arr, k);
        if (result1 != -1) {
            System.out.println("element found at index:" + result1);
        } else System.out.println("element not found");
        int result2 = lastSearch(arr, k);
        if (result2 != -1) {
            System.out.println("element found at index:" + result2);
        } else System.out.println("element not found");
    }
}



