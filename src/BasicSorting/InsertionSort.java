package BasicSorting;

public class InsertionSort {
    static void print (int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-2,7,8,-6};
        print(arr);
        int n = arr.length;

//        Best Case T.C. --> O[n]
//        Worst Case && Avg Case T.C. --> O[n^2]
//        It is Stable

//        Insertion Sort-1
        for (int i = 0; i < n; i++) {  //n-1 passes
            for (int j = i; j >= 1 ; j--) {
                if(arr[j]<arr[j-1])
                    swap(arr,j, j-1);
                else break;
            }
        }
        print(arr);

//        Insertion Sort-2
        for (int i = 0; i < n; i++) {
            int j = i;
            while(j>=1 && arr[i]<=arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
        print(arr);
    }
}
