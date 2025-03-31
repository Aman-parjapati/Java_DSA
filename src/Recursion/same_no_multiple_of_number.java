package Recursion;

import java.util.*;

public class same_no_multiple_of_number {
    static int multiple(int num,int k){
        if(k==0){
            return 1;
        }
        int result = multiple(num, k-1)*num;
        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int k= sc.nextInt();
        System.out.println(multiple(num, k));

    }
}
