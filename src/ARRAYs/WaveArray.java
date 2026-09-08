package ARRAYs;

import java.util.Arrays;
import java.util.Scanner;

//it means arr[1]>=arr[2]<=arr[3].........
public class WaveArray {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size:-");
        int x= sc.nextInt();
        int[]arr=new int[x];
        for (int i = 0; i<x ; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i <x ; i++) {
            System.out.println(arr[i]+" ");

        }
        for (int i = 0; i <x; i+=2) {
            if (i==x-1)break;
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
