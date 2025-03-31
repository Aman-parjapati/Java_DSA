package Recursion;


import java.util.Scanner;

    public class print_naturalno_n_to_1 {
        static void Main(int n){
            if(n==1) {
                System.out.println(n);
                return;
            }
            System.out.print(n+" ");
            Main(n-1);
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the value of n:");
            int n=sc.nextInt();
            Main(n);
        }
    }
