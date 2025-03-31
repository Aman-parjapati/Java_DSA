package BinarySearch;

public class BSAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1,5,14,20,25,30};
        int target = 24;
        int n = arr.length;
        boolean flag = false;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target){
                flag = true;
                break;
            }
            else if(arr[mid] > target) hi = mid-1;
            else if(target > arr[mid]) lo = mid+1;
        }
        if(flag == true) System.out.println("Target is present");
        else System.out.println("target not available");

    }
}
