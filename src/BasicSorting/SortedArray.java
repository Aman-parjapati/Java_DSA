package BasicSorting;

import java.util.Scanner;

public class SortedArray {
    static boolean Sortarray(int[] arr){
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of element: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Sortarray(arr));
    }
}
