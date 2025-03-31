package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Printing_the_stack_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

//        Taking user from input and printing the stack

//        System.out.print("Enter the number of element: ");
//        int n = sc.nextInt();
//        System.out.print("Enter the of element of stack: ");
//        for (int i = 1; i <=n; i++) {
//            int x = sc.nextInt();
//            st.push(x);
//        }

//        Printing Reverse order of stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
//            int x = st.peek();
//            rt.push(x);
//            st.pop();
            rt.push(st.pop());   // to remember-->pop can delete the stack element and it also has the access to that value
        }
        System.out.println(rt);
    }
}
