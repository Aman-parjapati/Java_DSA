package DyanmicProgramming;

// also called as 0/1 knapsack

public class knapsack {
    // time complexity = O(n*capacity), Auxiliary space complexity = O(n*capacity)
    public static int profit(int i, int[] wt, int[] val, int capacity, int[][] dp){
        if(i == wt.length) return 0;
        if(dp[i][capacity] != -1) return dp[i][capacity];
        int skip = profit(i+1, wt, val, capacity, dp);
        if (wt[i] > capacity) return dp[i][capacity] = skip; // means if bag capacity is less than the product weight
        // val[i] means curr object we are taking, i+1 -> after taking if there is space left then move forward
        // capacity-wt[i]  ==> means since we have taken the object subtract it from the weight for capacity left
        int take = val[i] + profit(i+1, wt, val, capacity-wt[i], dp);
        return dp[i][capacity] = Math.max(take, skip);
    }
    public static void main(String[] args) {
        int[] wt = {1,2,8,10};
        int[] val = {5,3,7,16};
        int capacity = 8;
        int n = wt.length;
        // i = 0 to n-1 ||  capacity = capa to 0
        int[][] dp = new int[n][capacity+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) dp[i][j] = -1;
        }
        System.out.println(profit(0, wt, val, capacity, dp));
    }
}
