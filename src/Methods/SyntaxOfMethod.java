package Methods;

public class SyntaxOfMethod {
    public static void Adarsh(){//
        System.out.println("abhay,abhi,abhishek,ajeet, adarsh");
        Abhi();//one function can call other function but none could call the main function
    }
    static void main() {
        //hm yahi par programming keye hai abhi tk & isko main function bolte hai
        //main methods runs first and after that if u call any other function in main function only then they  will run.
        System.out.println("this is fo r the everyone ");
        Adarsh();//function or method call ho raha hai
        System.out.println("everyone is happy with their family");
        Abhi();
    }
    public static void Abhi() {
        System.out.println("Adiyta");
    }
}
