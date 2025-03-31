package DyanmicProgramming;

import java.util.Arrays;

public class countDerangements {
    // using recursion
//    static int disarrange(int n) {
//        if (n == 1) return 0;
//        if (n == 2) return 1;
//        // countDer(n) = (n-1)[countDer(n-1) + der(n-2)]
//        return (n - 1) * (disarrange(n - 1) + disarrange(n - 2));
//    }
//    public static void main (String[] args) {
//        int n = 4;
//        System.out.println(disarrange(n));
//    }
    // using recursion + memoization
    static int calculate(int n, int[] dp) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (dp[n] != -1) return dp[n];
        // countDer(n) = (n-1)[countDer(n-1) + der(n-2)]
        return dp[n] = (n - 1) * (calculate(n - 1, dp) + calculate(n - 2, dp));
    }
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(calculate(n,dp));
    }
}
