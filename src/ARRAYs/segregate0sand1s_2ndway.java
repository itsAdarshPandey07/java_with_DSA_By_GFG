package ARRAYs;
import java.util.Arrays;
import java.util.Scanner;
public class segregate0sand1s_2ndway {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:-");
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i <x; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i <x ; i++) {
            System.out.println(arr[i]+" ");
        }
        int i=0;
        int j=x-1;
       while(i<j){
           if (arr[i]==0)
               i++;
           if (arr[j]==1)
               j--;
           if(i>j) break;
           if(arr[i]==1&&arr[j]==0){
               arr[i]=0;
               arr[j]=1;
               i++;
               j--;
           }

        }
        System.out.println(Arrays.toString(arr));
    }
}
