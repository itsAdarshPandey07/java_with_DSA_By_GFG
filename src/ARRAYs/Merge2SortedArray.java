package ARRAYs;
import java.util.Scanner;
//Merge 2 sorted arrays in a single big array.(3 pointer technique)
public class Merge2SortedArray {
    static void main() {
        int[] a = {2, 5, 6, 9};
        int[] b = {1, 3, 4, 5, 7, 8,67};
        int[] c = new int[a.length + b.length];
        for (int ele : c) System.out.print(ele + " ");
        System.out.println();
        merge(c, a, b);
        for (int ele : c) System.out.print(ele + " ");
        System.out.println();
    }
    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {//jbtk a&b ka length bada hoga unki index se
            if(a[i]<b[j]){//agar array ka ele b se chota hai to c array me a print kr do
        //aur fir a ko increase kr do .
                c[k]=a[i];
                i++;
            }
            else{//nhi to c array me b ko print kar do aur uska index increase kr do
                c[k]=b[j];
                j++;
            }
            k++;//k hamesha increase hoga qki usme add ho raha hai
            }
        if (i==a.length){//a array khtm hai b ke bache ko print kar do
            while(j<b.length){
               c[k++]=b[j++];
            }
        }
        else{//b array khatm hai a ke bache ele print kar do
        c[k++]=a[i++];
        }
    }
}
