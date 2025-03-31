package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElement {
        public static int[] nextLargerElement(int[] arr) {
            Stack<Integer> st = new Stack<>();
            int n = arr.length;
            int[] res = new int[n];
            for(int i=n-1;i>=0;i--){
                while(!st.isEmpty() && st.peek()<=arr[i]) {
                    st.pop();
                }
                if(st.isEmpty()) {
                    res[i] = -1;
                } else {
                    res[i] = st.peek();
                }
                st.push(arr[i]);
            }
            return res;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = nextLargerElement(arr);
        System.out.println("Next Larger Elements:");
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
