package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1,5,5,5,14,20,25,25,30};
        int n = arr.length;
        int lb = n;
        int target = 19;
        int lo =0, hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] >= target){  // this the condition for lower bound
                lb = Math.min(lb, mid);
                hi = mid-1;
            }
            else lo = mid+1;
        }
        System.out.println(lb);
    }
}
