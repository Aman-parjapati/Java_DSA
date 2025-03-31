package DyanmicProgramming;

import java.util.Arrays;
// time complexity = O(n*capacity), Auxiliary space complexity = O(n*capacity)
public class subsetSum {
    public static void main(String[] args) {
        int[] arr = {8,7,2,4};
        int target = 11;
        int[][] dp= new int[arr.length][target+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) dp[i][j] = -1;
        }
        System.out.println(subset(0,arr,target,dp));
    }

    private static boolean subset(int i, int[] arr, int target, int[][] dp) {
        if(i == arr.length){
            if(target == 0) return true;
            else return false;
        }
        if(dp[i][target] != -1) return (dp[i][target] == 1);
        boolean ans  = false;
        boolean skip = subset(i+1, arr, target, dp);
//        if(target-arr[i] < 0) return dp[i][target] = skip;  // only valid if arr contains +ve numbers
        if(target-arr[i] < 0) ans = skip;
        else {
            boolean pick = subset(i+1, arr, target-arr[i], dp);
            ans = pick || skip;
        }
        dp[i][target] = (ans) ? 1 : 0;
        return ans;
    }
}
