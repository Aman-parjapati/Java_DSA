package DyanmicProgramming;

import java.util.Scanner;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int m = s.length(), n = t.length();
        int max = 0;
        int[][] dp = new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){  // not j=0 bcz dp[i-1][j-1] = -1
                if(s.charAt(i-1) == t.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = 0;
                max = Math.max(max, dp[i][j]);
            }
        }
        System.out.println(max);
    }
}
