package Array;

import java.util.Scanner;

public class Triplet_pair_sum {
    static int tripletpairsum(int[] nums, int target){
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.print("Enter the value of array:");
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of target:");
        int target = sc.nextInt();
        System.out.println(tripletpairsum(nums, target));
    }
}
