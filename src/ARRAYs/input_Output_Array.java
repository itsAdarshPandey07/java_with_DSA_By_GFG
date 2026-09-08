package ARRAYs;
import java.util.Scanner;
public class input_Output_Array {
    static void main() {
        Scanner Sc=new Scanner(System.in);
        int[]arr={12,13,1,34,3,4,5};
        int n=arr.length;//arr.length is used to know length of arr if it is very high in number.(index=0 to n-1)
        for (int i = 0; i <n; i++) {//it is used to give output in easy way
            System.out.print(arr[i] + " ");//output
        }
            System.out.print("enter the size of array:-");
            int x=Sc.nextInt();
        int [] Arr=new int[x];
            for (int j = 0; j <x ; j++) {
                Arr[j] = Sc.nextInt();//input
            }
            for (int j = 0; j <x ; j++) {
                System.out.print(Arr[j]+" ");//printing



            }


            }

        }



