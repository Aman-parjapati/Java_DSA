package Recursion;
import java.util.*;
public class Sum_of_n_natural_no {
    static int Main(int n){
        if(n==0){
            return n;
        }
        return n+Main(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println(Main(n));
    }
}
