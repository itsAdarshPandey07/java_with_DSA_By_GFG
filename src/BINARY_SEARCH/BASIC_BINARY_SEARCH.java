package BINARY_SEARCH;
public class BASIC_BINARY_SEARCH {
    public static int search(int []arr,int target) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > target)
                hi = mid - 1;
            else if (arr[mid] < target)
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

        static void main() {
            int[] arr = {12, 13, 14, 15, 16, 17, 189, 1111, 9999};
            int target=1111;
           int result= search(arr,target);
            if(result!=-1){
                System.out.println("element found at index:"+result);
            }
            else System.out.println("element not found");
        }
    }



