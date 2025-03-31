package Array;
import java.util.*;
public class occurence_of_1_element {
    static int countoccurence(int[] arr, int x){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x)
                count++;
        }
        return count;
    }


//    this function for the last occurence of the elament x in the given array
    static int lastoccurence(int[] arr, int x){
        int lastoccurence = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x)
                lastoccurence=i;
        }
        return lastoccurence;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the value of X:");
        int x = sc.nextInt();
        System.out.print("Enter the value of the array element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countoccurence(arr,x));
        System.out.println(lastoccurence(arr,x));
    }
}
