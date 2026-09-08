package Methods;

public class PassByValueAndReference{
    public static void change(int x){
        x=10;
        System.out.println("10");
    }
    static void main() {
        int x = 6;
        System.out.println(x);
        change(x);//this is pass by value
        System.out.println(x);
    }
}