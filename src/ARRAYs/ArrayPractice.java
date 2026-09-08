package ARRAYs;

import java.util.Scanner;

//ques:-mulitply odd index by 2 and add 10 to even indexed element
public class ArrayPractice {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:-");
        int x = sc.nextInt();
        int[] Arr = new int[x];
        System.out.print("enter the element of array:-");
        for (int i = 0; i < x; i++) {
            Arr[i] = sc.nextInt();
        }
            for (int i = 0; i < x; i++) {
                if (i % 2 == 0)
                    System.out.println(Arr[i] + 10 + " ");
                else
                    System.out.println(Arr[i] * 2 + " ");
            }
    }
}



