package BINARY_SEARCH;
public class SearchinRotatedSortedArray {
    public static int search(int[] arr, int tar) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == tar) return mid;
            else if (arr[lo] <= arr[mid]) {//low to mid is sorted
                if (arr[lo] <= tar && tar < arr[mid]) hi = mid - 1;
                else lo = mid + 1;
            } else {//mid to hi is sorted
                if (arr[mid] < tar && tar <= arr[hi]) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        return -1;
    }

    static void main() {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        int tar = 3;
        int result= search(arr, tar);
        if (result!=-1){
            System.out.println("the index of the array:-"+result);
        }
    }
}

