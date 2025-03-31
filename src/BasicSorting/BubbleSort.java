package BasicSorting;

public class BubbleSort {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        print(arr);

        // Bubble sort -- optimized approach   and Stable Sort
        for (int x = 0; x < n-1; x++) {
            boolean flag = true;
            for (int i = 0; i < n-1-x; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }
        print(arr);


        // Bubble sort -- 1
        for (int x = 0; x < n-1; x++) {
            for (int i = 0; i < n-1; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        print(arr);


        // Bubble sort -- 2
        for (int x = 0; x < n-1; x++) {
            for (int i = 0; i < n-1-x; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        print(arr);

    }
}
