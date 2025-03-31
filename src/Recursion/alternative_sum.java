package Recursion;

import java.util.*;
public class alternative_sum {
//    static int Main(int n){
//        if(n==0) return 0;
//        if(n%2==0){
//            return Main(n-1)-n;
//        }
//        return Main(n-1)+n;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(Main(n));
//    }

    static int Main(int n){
        if(n==0) return n;
        if(n%2==0){
            return Main(n-1)-n;
        }
        return Main(n-1)+n;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
        System.out.println(Main(n));
    }

}
