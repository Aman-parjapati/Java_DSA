package DyanmicProgramming;

import java.util.Scanner;

public class fibonacci {

    // (this is recursion + memoization/ lookup table ) == know as top-down dp or recursive dp
    // memoization/ lookup table ---> this both words refers to the array in which value is being stored
    static int[] dp;
    static int fib(int n){
        if(n==0 || n==1) return n;
        if(dp[n] != 0) return dp[n];  // checking if it's available in arr or not
        int ans = fib(n-1) + fib(n-2);
        dp[n] = ans;  // adding the value in arr just in case we call it again
        return ans;
    }

    // this is called tabulation method  ---> bottom-up dp
//    static int tabulationfib(int n){
//        if(n<=1) return n;
//        int[] tabdp = new int[n+1];
//        tabdp[0] = 0; tabdp[1] = 1;
//        for (int i = 2; i <=n; i++) {
//            tabdp[i] = tabdp[n-1]+tabdp[n-2];
//        }
//        return tabdp[n];
//    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        dp = new int[n+1];
        System.out.println(fib(n));
//        System.out.println(tabulationfib(n));
    }
}
