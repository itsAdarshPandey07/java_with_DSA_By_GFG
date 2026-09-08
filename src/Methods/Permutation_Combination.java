package Methods;
import java.util.Scanner;
//nCr:n!/r!(n-r)! and nPr=n!/(n-r)!
public class Permutation_Combination {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
        }
    static void main() {
            Scanner Sc = new Scanner(System.in);
            System.out.print("enter the value of n:");
            int n = Sc.nextInt();
            System.out.print("enter the value of r");
            int r = Sc.nextInt();
      /*/  int nfact =1;
        for (int i = 1; i <=n ; i++) {
            nfact*=i;
        }
        int rfact=1;
        for (int i = 1; i <=n ; i++) {
            rfact*=i;
        }
        int nminusr=1;
        for (int i = 1; i <=n-r ; i++) {
            nminusr*=i;

        }/*/
            int nCr = fact(n) / fact(r) * fact(n - r);
            int nPr = fact(n) / fact(n - r);
            System.out.println(nCr+" "+nPr);

        }
    }

