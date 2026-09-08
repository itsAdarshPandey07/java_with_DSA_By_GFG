package ARRAYs;
//this is two pointer technique
import java.util.Scanner;
public class ReverseArray {
    static void main() {
    Scanner sc=new Scanner(System.in);
    int x= sc.nextInt();
    int []arr=new int[x];
        for (int i = 0; i <x ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <x ; i++) {
            System.out.println(arr[i] + " ");
        }
          int a=0;
          int b=x-1;
         while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
         }
        for (int ele: arr)
          System.out.print(ele+" ");

            }

        }
