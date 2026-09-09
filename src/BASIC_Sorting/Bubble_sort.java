package BASIC_Sorting;
public class Bubble_sort {
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main() {
        int[]arr={1,9,7,6,5,4,3};
        int n= arr.length;
        print(arr);
      //  for (int i = 0;i<n-1 ;i++) {//ye loop used ho raha hai n-1 bari condition check ke leye
        //    for (int j= 0; j<n -1-i; j++) {//here be can also put n-1 but that is not best approch
          //      if (arr[j] > arr[j+ 1]) {
            //        int temp = arr[j];
              //      arr[j] = arr[j + 1];
                //    arr[j + 1] = temp;
           //     }
            //}
        //}
      //bubble sort optimised code
        for (int i = 0;i<n-1;i++) {//n-1 pass
            boolean isSorted=true;
            for (int j = 0; j < n - 1 - i; j++) {//here be can also put n-1 but that is not best approch
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted=false;
                }
            }
            if (isSorted==true) break;
        }
        print(arr);
    }
}
