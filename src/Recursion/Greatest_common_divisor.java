package Recursion;
import java.util.*;

public class Greatest_common_divisor {
    static int divide(int x, int y){
        if(y==0) return y;
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }

//    using euclids algorithm

    static  int euclid(int x, int y){
        if(y==0) return x;
        return euclid(y,x%y);

//        two find lcm, we know that========>lcm*gcd=x*y
//        so lcm=x*y/gcd        (gcd==greatest common divisior)

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println(divide(x,y));
        System.out.println(euclid(x,y));
        System.out.println((x*y)/euclid(x,y));     // this will print the lcm of the two numbers

    }
}
