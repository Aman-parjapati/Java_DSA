package Recursion;
import java.util.*;
public class multiple_of_num {
      static void Main(int n,int k ){
          if(k==0){
              return;
          }
          Main(n,k-1);
          System.out.println(n*k);
      }

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the value of n:");
          int n = sc.nextInt();
          System.out.println("enter the value of k:");
          int k = sc.nextInt();
          Main(n,k);
      }

}
