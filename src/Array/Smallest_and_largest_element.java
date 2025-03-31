package Array;
import java.util.*;

public class Smallest_and_largest_element {
    static void Main(int[] arr){          //  ----for sorting the array
        Arrays.sort(arr);                 // - ------ to copy a array we can use array.clone()
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] smallestlargest(int arr[]){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the values of the array:");
        int[] arr= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Main(arr);
        int[] result = smallestlargest(arr);
        System.out.println("Smallest element: " + result[0]);
        System.out.println("Largest element: " + result[1]);
    }
}
