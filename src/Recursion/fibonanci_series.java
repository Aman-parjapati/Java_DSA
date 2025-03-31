package Recursion;

import java.util.Scanner;

public class fibonanci_series{
    static int main(int n){
        if(n==0 || n==1) return n;
        return main(n-1) + main(n-2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(main(n));
    }
}
