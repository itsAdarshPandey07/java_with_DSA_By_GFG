package Methods;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

//Method or function ko hm reusebility ko increase karne ke leye karte hai.
//Built -in methods:-Ise function or method jo phele se defined ho
public class basic_in_method {
    static void main() {
        System.out.println(Math.sqrt(4));//this is builtin function
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of x:-");
        double x=sc.nextInt();
        System.out.println(Math.sqrt(x));//this is builtIn function of sqr root
        System.out.println(Math.cbrt(x));//this is builtIn function of cube root
        System.out.println(Math.PI);
        System.out.println(Math.abs(-45));//it is mod function
        System.out.println(Math.floor(4.44));//it is greatest integer floor funt that give floor value,
        System.out.println(Math.floor(-3.8));//in this gif it lie between -3 to -4  and its floor value is -4.
        System.out.println(Math.ceil(3.001));//IT IS THE GREATEST OF CIEL FUNCTION
        System.out.println(Math.min(12,23));//IT IS MINIMUM FUNCTION
        System.out.println(Math.max(1213,2222));//IT IS MAXIMUM FUNCTION
        System.out.println(Math.pow(2,6));//IT IS THE POWER FUNCTION, here


    }
}
