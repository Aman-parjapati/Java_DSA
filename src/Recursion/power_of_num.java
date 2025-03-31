package Recursion;
import java.util.*;
public class  power_of_num {
    static int power(int p, int q){
        // if power is 0 then the value is 1
        if(q==0){
            return 1;
        }
        int smallans = power(p, q-1);  //this is recursive case. in this we are power of p as p^(q-1)
        return smallans * p;   // here we are multiplying p^(q-1) with p which means the power will be like p^(q-1+1)=p^q
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(power(p,q));
    }
//    static int Main(int p, int q){
//        if(q == 0){
//            return 1;
//        }
//        int smallpow=Main(p,q/2);
//        if(q%2==0){
//            return smallpow*smallpow;
//        }
//        return p*smallpow*smallpow;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int p= sc.nextInt();
//        int q= sc.nextInt();
//        System.out.println(Main(p, q));
}
