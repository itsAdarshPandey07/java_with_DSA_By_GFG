package ARRAYs;
public class PassingArrayTOFunction {
    static void main() {
        int[] x={12,13,14,15};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);

    }
    public static void change(int[]y){
        y[2]=69;
    }
}
