package Recursion;

import java.util.*;
public class Sum_of_digits_of_no {
    static int Main(int n){
        if(n==0 && n<=9){
            return n;
        }
        return Main(n/10) + n%10;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Main(n));
    }
}
