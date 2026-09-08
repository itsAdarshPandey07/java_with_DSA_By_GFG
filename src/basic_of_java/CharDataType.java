package basic_of_java;
//char(inside single quote) is the data type that take all the character from a to z alphabet
public class CharDataType {
    static void main() {
        char adi='a';
        char ram='7';
        char eva='+';
        System.out.println(adi+0);//char+int=int
        System.out.println(ram);
        System.out.println(eva);
//ASCII value:-a=97 ,b=98,c=99......z=122
//ASCII value:-A=65,B=66,C=67......Z=90
//ASCII value:-0=48,1=49.........9=57
        //typecasting means conversion of one data type to another.
        int x= adi;//implicit (internally)type casting
        System.out.println(x);
        int y=(int)ram;//explicit (that can be visible )typecasting
        System.out.println(y);
        //integer to charcter
        int a=98;
        char ch=(char)a;
        System.out.println(ch);
        //BODMAS:-/,*,% > +,-
        int A=4*2/3;
        System.out.println(A);

    }
}
