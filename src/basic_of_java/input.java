package basic_of_java;

import java.util.Scanner;

public class input {
    static void main() {
        Scanner sc=new Scanner(System.in);//this is used to take input
        System.out.print("enter the radius:-");
        double r=sc.nextDouble();//
        double a=3.141592*r*r;
        System.out.print("area of circle is :-");
        System.out.println(a);
    }
}
