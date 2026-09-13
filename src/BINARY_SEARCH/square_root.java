package BINARY_SEARCH;

import java.util.Scanner;

public class square_root {
    public static int floorsqr(int n) {
        long lo = 1, hi = n;
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            if (mid * mid == n) return (int) mid;
            else if (mid * mid > n) hi = mid - 1;
            else lo = mid + 1;
        }
        return (int) hi;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        int result = floorsqr(n);
        System.out.println("floor square root of "+ n +" is:"+result);
    }
}