package IF_Else;

import java.util.Scanner;

//Ques:-given a point x&y wap to find out if its lies in 1st,2,3 or 4th
//quadrant ,on the x-axis,y-axis or at the origin.
public class practice8 {
    static void main() {
    Scanner Sc=new Scanner(System.in);
        System.out.print("enter the point x:-");
        double x=Sc.nextDouble();
        System.out.print("enter the point y:-");
        double y= Sc.nextDouble();
        if(x==0&&y==0){
            System.out.println("At the origin");
        } else if ( y==0) {
            System.out.println("At the x-axis");
        } else if (x==0 ) {
            System.out.println("At the y-axis");
        } else if (x>0&&y>0) {//(+,+)
            System.out.println("At the 1st quadrant");
        } else if (x<0&&y>0) {//(-,+)
            System.out.println("At the 2nd Quadrant");
        } else if (x<0&&y<0) {//(-,-)
            System.out.println("At the 3rd Quadrant");
        } else {
            System.out.println("At the 4th Quadrant");

        }
    }
}
