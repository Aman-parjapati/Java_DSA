package Stacks.Stacks_Conversions;
import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        //  9-+53*4/6
        //  9-*+534/6
        //  9-/*+5346
        //  -9/*+5346
        System.out.println("Infix : "+str);
        Stack<String> val= new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii>=48 && ascii<=57){
                String s = "" + ch;
                val.push(s);
            } else if (op.size()==0 || ch=='(' || op.peek()=='(') {
                op.push(ch);
            } else if (ch==')') {
                while (op.peek()!='('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o+v1+v2;
                    val.push(t);
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o+v1+v2;
                    val.push(t);
                    //push
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/') {
                        //work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o+v1+v2;
                        val.push(t);
                        // push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }

        }
        while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o+v1+v2;
            val.push(t);
        }
        String prefix = val.pop();
        System.out.println("Prefix: "+prefix);
    }
}