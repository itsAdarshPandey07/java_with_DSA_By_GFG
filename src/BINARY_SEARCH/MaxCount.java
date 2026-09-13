package BINARY_SEARCH;
public class MaxCount {
    public static int Maxcount(int[]nums){
   int pos=0,neg=0,idx=-1;
   for(int arr:nums){
       if(arr>0) pos++;
       else if (arr<0) neg++;

   }
return Math.max(pos,neg);
    }
    static void main() {
        int []nums={-2,-1,-3,1,2,3,4};
        System.out.println("the maximum count is:-"+Maxcount(nums));

    }
}
