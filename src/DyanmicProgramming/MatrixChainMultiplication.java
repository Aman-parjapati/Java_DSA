package DyanmicProgramming;

import java.util.Arrays;

public class MatrixChainMultiplication { // also known as partition multiplication

    // this is for min cost, if i want max cost i can do Math.max, maxCost = Integer.MIN_VALUE
//    private static int mcm(int i, int j, int[][] arr){
//        if(i == j) return 0;
//        int minCost = Integer.MAX_VALUE;
//        for (int k = i; k < j; k++) {
//            int x = arr[i][0] * arr[k][1] * arr[j][1] ;  // 1st ele-->1 * k,1 -> 2 * last ele -> 4
//            int totalCost = mcm(i, k, arr) + mcm(k+1, j, arr) + x;
//            minCost = Math.min(minCost, totalCost);
//        }
//        return minCost;
//    }
//
//    public static void main(String[] args) {
//        int[][] arr = {{1,2},{2,3},{3,4}};  // 2d input
//        int n = arr.length;
//        System.out.println(mcm(0, n-1, arr));
//    }

    // in this the input is given in different manner
    private static int mcm(int i, int j, int[] arr, int[][] dp){
        if(i == j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int minCost = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int x = arr[i] * arr[k+1] * arr[j+1] ;  // 1st ele-->1 * k,1 -> 2 * last ele -> 4
            int totalCost = mcm(i, k, arr, dp) + mcm(k+1, j, arr, dp) + x;
            minCost = Math.min(minCost, totalCost);
        }
        return dp[i][j] = minCost;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};  // 1d input  --> total 4 matrices
        int n = arr.length;
        int[][] dp = new int[n-1][n-1];
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-1; j++)
                dp[i][j] = -1;
        System.out.println(mcm(0, n-2, arr, dp));
    }
}
