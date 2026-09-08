package LOOPs;
//Wap to print all even number from 1 to 100
public class loop_practice1 {
    static void main() {
        System.out.println("the even numbers are:-");
        for (int i = 1; i <= 100; i = i + 1) {
            // ye  code effetive nahi hai qki isme 101 bar iteration ho raha hai
            //iske place pe:- for(int i=0;i<=100;i=i+2) ab isme code iteration bhi
            // utne bar hoga jitna even no hoga.
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}

