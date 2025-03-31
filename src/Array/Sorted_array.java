
//  Sorted array means the array should be in a sequence (either in ascending or the descending order)
//  Every array in the sorted array is greater than the previous array-----Quality of Sorted array
package Array;
import java.util.*;
public class Sorted_array {
    static boolean sortedarray(int[] arr){
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the value of arr:");
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sortedarray(arr));
    }
}
