package Stacks.Stacks_Conversions;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> st = new Stack<>();

        // in Postfix the loop will always run in the forward direction
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }

            // here the 1st pop will be v2 but in prefix the 1st pop will be v1
            else {
                int v2 = st.pop();
                int v1 = st.pop();
                if(ch=='+') st.push(v1+v2);
                if(ch=='-') st.push(v1-v2);
                if(ch=='*') st.push(v1*v2);
                if(ch=='/') st.push(v1/v2);
            }
        }
        int x = st.pop();
        System.out.println(x);
    }
}
