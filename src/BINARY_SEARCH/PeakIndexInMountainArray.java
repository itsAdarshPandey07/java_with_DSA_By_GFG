package BINARY_SEARCH;
public class PeakIndexInMountainArray {
    public static int MountainArray(int[]arr){
        int lo=1,hi=arr.length-2;//lo to hi is search space
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])
                //agar mid bda hai mid ke phele wale se aur mid ke bad wale se to mid is peak hoga
                return mid;
            else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1])
                //iska mtlb hai agr mid bda hai mid kwe phele element se aur chota hai mid ke bd wale element se to lo ko mid+1 kar do
                lo=mid+1;
            else
                hi=mid-1;
        }
        return -1;
    }
    static void main() {
        int []arr={0,1,2,3,4,3,2,1};
        int result=MountainArray(arr);
        if (result!=-1)
            System.out.println("peak index in mountain array is:"+result);
        else System.out.println("not found");
    }
}
