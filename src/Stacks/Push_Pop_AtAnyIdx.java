package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Push_Pop_AtAnyIdx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack: "+st);

        // to insert at bottom

        Stack<Integer> temp = new Stack<>();
        while (st.size()>0){
            temp.push(st.pop());
        }
        st.push(0);
        while (temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println("After inserting at bottom: "+st);

        // to insert at any idx

        System.out.print("which idx u wanna insert: ");
        int idx = sc.nextInt();
        System.out.print("Enter the value u want to insert: ");
        int x = sc.nextInt();
        while (st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while (temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println("After insertion at 2nd idx: "+st);

    }
}
