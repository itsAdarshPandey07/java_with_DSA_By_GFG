package BASIC_Sorting;

public class MoveAllZerosToEnd {
        public static void print ( int[] arr) {
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        static void main () {
            int[] arr = {1, 9, 7,0, 6, 5,0, 4, 3};
            int n = arr.length;
            print(arr);

            int j = 0; // position where next non-zero element will go

                    for (int i = 0; i < arr.length; i++) {

                        if (arr[i] != 0) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;

                            j++;
                        }
                    }
                    print(arr);
        }
}
