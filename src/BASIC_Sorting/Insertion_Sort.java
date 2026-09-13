package BASIC_Sorting;
//in this sorting we make a sorted and unsorted part and compare the element of sorted part to the first element of the unsorted path
//t.c:-average case& worst case :-O(n^2),best case:-O(n)
public class Insertion_Sort {
    static void main() {
int[]arr={4,6,4,8,9,121,22,33};
        for (int i = 0; i <arr.length ; i++) {
            int j=i;
            while(j>0&&arr[i]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
        for (int ele:arr)
            System.out.print(ele+" ");
    }
}
