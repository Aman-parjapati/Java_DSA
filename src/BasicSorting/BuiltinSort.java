package BasicSorting;

import java.util.Arrays;

public class BuiltinSort {
    public static void main(String[] args) {
        int[] arr = {1,2,-4,7,50,5};
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
