package LOOPs;
//continue is used to skip the iteration on particular condition
public class Continue {
    static void main() {
        for (int i = 1; i <=20 ; i++) {
            System.out.println(i+" ");
            if(i==13){
            System.out.println("skip");
            continue;
            }

            System.out.println("good morning");

        }
    }

}
