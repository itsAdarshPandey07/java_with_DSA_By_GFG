package BINARY_SEARCH;
public class findFloorInSortedArray {
    public static int findfloor(int []arr, int tar) {
        int lo = 0, hi = arr.length - 1, idx = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > tar) hi = mid - 1;
            else {
                idx = mid;
                lo = mid + 1;
            }
        }
        return idx;
    }

    static void main() {
    int []arr={1,2,8,10,10,12,19};
    int tar=5;
   int result= findfloor(arr,tar);
        System.out.println("the index of floor value is:-"+result);
    }
}
