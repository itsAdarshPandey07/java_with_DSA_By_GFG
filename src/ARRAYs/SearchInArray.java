package ARRAYs;
import java.util.Scanner;
//Search in the Array
public class SearchInArray {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of target :-");
     int [] arr={12,13,14,15,18,88,6};
     int target= sc.nextInt();
     boolean flag =false;//false means target array me nhi hai
        for(int i = 0; i <arr.length ; i++) {
            if(arr[i] == target){
                flag=true;//true means target array me hai
                break;
            }

        }
        if (flag==true)
            System.out.println("Target exist in array");
        else System.out.println("Target missing in array");
    }
}
