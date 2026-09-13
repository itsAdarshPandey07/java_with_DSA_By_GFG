package BASIC_Sorting;

public class Largest_first_bySelectionSort {
        public static void print(int[] arr) {
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        static void main() {
            int[] arr = {1, 9, 7, 6, 5, 4, 38,66};
            int n = arr.length;
            print(arr);
            for (int i = 0; i < n - 1; i++) {//n-1 passes
                int max= Integer.MIN_VALUE,mindx = -1;
                for (int j =i; j < n; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
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



