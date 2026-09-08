package ARRAYs;
//Array is used to store the data linearly it is mutable (changeable) in nature
public class BasicsOfArrays {
    static void main() {
        int [] x={ 12,1,24,34,33};//1st initialization syntax
        System.out.println(x[0]);//access through the indexing
        x[4]=233;//we can update the value with the help of indexing
        System.out.println(x[4]);
        int[] arr=new int[5];//2nd way to initialization
        arr[0]=12;
        arr[1]=23;
        arr[2]=22;
        arr[3]=21;
        arr[4]=12;



    }
}
