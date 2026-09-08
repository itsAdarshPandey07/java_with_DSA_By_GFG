package Methods;

public class MaxOfTwo {
    public static int max(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }
    static void main() {
        System.out.println(max(5,8));

    }
}
