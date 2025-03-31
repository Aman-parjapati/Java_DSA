package BasicSorting;

import java.util.Scanner;

public class CheckifArrayisSortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. arr element: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the arr element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                System.out.println("Sorted");
            }
            else{
                System.out.println("Unsorted");
                break;
            }
        }
    }
}
