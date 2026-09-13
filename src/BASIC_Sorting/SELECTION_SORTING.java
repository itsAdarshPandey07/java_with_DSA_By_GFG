package BASIC_Sorting;
//Array me jao sabse chota ya bada element lao aur first ele se swap kar do
//bubble sort me swapping jada hote hai isme km hota hai
//it consist of sorted and unsorted path
//t.c of this sorting in all three cases are O(n^2)
//selection is unstable means no ordering if element is same
public class SELECTION_SORTING {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    static void main() {
        int[] arr = {1, 9, 7, 6, 5, 4, 3};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n - 1; i++) {//n-1 passes
            int min = Integer.MAX_VALUE,mindx = -1;
            for (int j =i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        print(arr);
    }
}


