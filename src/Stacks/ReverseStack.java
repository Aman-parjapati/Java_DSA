package Stacks;

import java.util.Stack;

// without using inbuilt functions
public class ReverseStack {

    static void pushAtBottom(Stack<Integer> st, int x){
        if (st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    static void reversestack(Stack<Integer> st){
        if(st.size() == 1) return;
        int top = st.pop();
        reversestack(st);
        pushAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack: "+st);
        reversestack(st);
        System.out.println(st);
    }
}
