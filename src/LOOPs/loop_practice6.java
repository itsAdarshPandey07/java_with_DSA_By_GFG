package LOOPs;

import java.util.Scanner;

//wap to print sequence 1 n n-1 3 n-2...
public class loop_practice6 {
    static void main() {
        Scanner SC = new Scanner(System.in);
        System.out.print("enter value of n:");
        int n = SC.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {//odd position increase 1,2,3,4..
                System.out.println((i + 1) / 2 + " ");
            } else {//even position decrease from n,n-1,n-2,n-3....
                System.out.println(n - i / 2 +1 + " ");
            }
        }
    }
}
