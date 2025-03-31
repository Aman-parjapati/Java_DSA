package DyanmicProgramming;

import java.util.Scanner;

public class printLCS { // Leetcode 1143 -> longest common subsequence (may, may not have gap)
    // using space optimization
    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] =  1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        StringBuilder str = new StringBuilder("");
        int i = m, j = n;
        while(i>0 && j>0){
            if(text1.charAt(i-1) == text2.charAt(j-1)) {
                str.append(text1.charAt(i-1));
            }
            if(dp[i-1][j] > dp[i][j-1]) i--;
            else j--;
        }
        str.reverse();
        System.out.println(str);
        return dp[m][n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();  // abcde, fabgdk
        System.out.println(longestCommonSubsequence(a,b));
    }
}
