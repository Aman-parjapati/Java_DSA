package Recursion;

import java.util.*;
public class print_1_to_n_num {
    static int Main(int n){
        if(n==1){
            return n;
        }
        System.out.println(Main(n-1));
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n= sc.nextInt();
        System.out.println(Main(n));
    }
}
