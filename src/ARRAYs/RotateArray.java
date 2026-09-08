package ARRAYs;
public class RotateArray {
    static void main() {
    int []arr={12,13,141,51,23,4,5,6,7};
    int d=5;
    int n= arr.length;
    d=d%n;
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]+" ");
        }

        }

   public static void reverse(int []arr,int i,int j) {
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
