package BINARY_SEARCH;
import java.util.Scanner;
public class SearchInDescendingSortedArray {
    public static int Search(int[] arr, int tar) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == tar)
                return mid;
            else if (arr[mid] > tar)
                lo = mid + 1;
            else if (arr[mid] < tar)
                hi = mid - 1;
        }

        return -1;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int x = sc.nextInt();
        System.out.print("enter the desending sorted array array:-");
        int []arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the target element :-");
       int  tar = sc.nextInt();
        int result = Search(arr, tar);
        if (result != -1) {
            System.out.println("element found at index:" + result);
        }
        else System.out.println("element not found");
    }
}
