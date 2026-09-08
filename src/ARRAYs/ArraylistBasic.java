package ARRAYs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Arraylist is used to fixed the problem of the array (array fixed hota hai but ye fixed nhi hota hai )
public class ArraylistBasic {
    static void main() {
        //syntax of arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        //these are used to add element in arraylist,we insert element from back
        arr.add(24);
        arr.add(21);
        arr.add(18);
        arr.add(45);
        arr.add(7);
        //System.out.println(arr[2]); this not valid to access specific element
        System.out.println(arr.get(2));//it is used to access specific element
        //System.out.println(arr[2]=12);this is not valid to update value
        //arr.get(2)=12; not valid
        arr.set(2, 10);//this is used to update value
        System.out.println(arr);//not traversing the array by ourselves
        int n = arr.size();//array has .length but arraylist have .size()
        //to print as array
        for (int i = 0; i < n; i++) {
            System.out.println(arr.get(i)+" ");
        }
        //array printing with the help of for each loop
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        //our array:-24 21 10 45 7
        arr.add(78);//it become:-24 21 10 45 7 78
        arr.add(3,34);//24 21 10 34 45 7 78 isme specific idx pe add hoga aur us index ki value +1 ho jayege
        System.out.println(arr);
        arr.remove(3);//it is used to remove the element from certain index
        arr.remove(n);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
        int i=0,j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
         //   arr.get(i)=arr.get(j);wrong
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
        }
}
