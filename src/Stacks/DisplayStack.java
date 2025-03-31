package Stacks;

import java.util.Stack;

public class DisplayStack {

    static void displayRecursivereverse(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRecursivereverse(st);
        st.push(top);
    }

    static void displayRecursive(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        displayRecursive(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack: "+st);
        Stack <Integer> rt = new Stack<>();
        displayRecursivereverse(st);
        System.out.println();
        displayRecursive(st);

        // printing the stack by creating another stack
//        while (st.size()>0) {
//            rt.push(st.pop());
//        }
//        while (rt.size()>0){
//            int x = rt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }

        // printing the stack by creating an array
//        int n = st.size();
//        int[] arr = new int[n];
//        for (int i = n-1; i >=0 ; i--) {
//            arr[i] = st.pop();
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//        }

    }
}
