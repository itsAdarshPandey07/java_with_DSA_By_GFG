package Methods;
//return type kuch value hold kar sakta hai and call bhi ho jata hai and also they end the function
//void does not have any value of itself
public class ReturnType {
    public static int Prasun(int a ){
        System.out.println("god is omnipresent");
        System.out.println("karma always returns");
        if (a>0)
           return 5;
        else
            return 10;
    }
    static void main() {
        int x=Prasun(7);
        System.out.println(x+3);

    }
}
