package Stacks.Stacks_Conversions;
import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        String st = "-9/*+5346";
        Stack<Integer> val = new Stack<>();

        // In prefix always run the loop in backwards direction/ reverse order
        for (int i = st.length()-1 ; i >=0 ; i--) {
            char ch = st.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii <=57) val.push(ascii-48);

            // here the 1st pop will be v1 but in prefix the 1st pop will be v2
            else{
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }
        int x = val.pop();
        System.out.println("Prefix is: "+x);
    }
}
