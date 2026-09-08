package LOOPs;
// In do while loop first you should write what u want to do then apply while condition.
// In do while loop if the condition is out of bound then also it run 1 time by default
public class Do_while_loop {
    static void main() {
       int i=11;
        do {//here we write that we want to do
          System.out.println(i+" ");
            i++;
        }
        while (i<=10);//condition after the do
     // this is the infinite loop condition no good
    //for(int i=1;i<=10;i--){
     //   System.out.println(i);
    }
}
