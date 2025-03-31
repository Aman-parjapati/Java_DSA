package Array;
import java.util.Scanner;
public class Array_Manipulation {

    static int arr(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans=0;  // ans will never be -1 bcz there will be always one element with does not have any copy
//        can also initiliase any other number
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0)
                ans=arr[i];
        }
        return  ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the elements of arrays:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(arr(arr));
    }

}
