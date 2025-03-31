package Stacks;

import java.util.Stack;

// stacks follows FILO/ LIFO

public class Basic {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        System.out.println(st.isEmpty());  // 2nd element isEmpty-->gives ans in true and false

        st.push(10);   // 1st element is push--> means to add
        st.push(20);
        st.push(30);
        st.push(40);  // 2nd element from the top
        st.push(50);  // this is the top element
        st.remove(10);
        System.out.println(st);
        System.out.println("Size is: " + st.size());  // 4th element size()--> gives the size of stack
        System.out.println("Topmost element: "+st.peek());  //5th element peek--> gives the topmost element in stack

        st.pop();  //3rd element pop--> deletes the top most element
        st.pop();  // to remember-->pop can delete the stack element and it also has the access to that value
        System.out.println(st);
        System.out.println("Size is: "+st.size());
        System.out.println("Topmost element: "+st.peek());
    }
}
