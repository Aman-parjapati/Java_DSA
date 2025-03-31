package BasicSorting;

public class SelectionSort {

    static  void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

//    T.C--> O[n^2]  for all cases ,    Auxiliary space == O[1],    UNSTABLE SORT

    public static void main(String[] args) {
        int[] arr = {1,2,-2,7,8,-6};
        print(arr);
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < n; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        print(arr);
    }
}
