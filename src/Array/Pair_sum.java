package Array;
import java.util.*;

public class Pair_sum {
    static int pairsum(int[] arr, int target){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {  //1st number loop
            for (int j = i+1; j < arr.length; j++) {   // 2nd number loop
                if(arr[i]+arr[j]==target)
                    ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n=sc.nextInt();
        System.out.print("enter the value of target:");
        int target = sc.nextInt();
        System.out.print("enter the value of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pairsum(arr, target));
    }
}
