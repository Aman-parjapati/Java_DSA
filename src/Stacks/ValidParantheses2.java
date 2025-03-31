package Stacks;
import java.util.*;

public class ValidParantheses2 {

    static int countMinbrackets(String str){
        Stack<Character> st = new Stack<>();
        int removeCount = 0;

//        here this is for each loop can be done by this as well
//        for (char ch : str.toCharArray()) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') st.push(ch);
            else if (ch == ')') {
                if(st.isEmpty()){
                    removeCount++;
                }
                else st.pop();
            }
        }
        removeCount += st.size();
        return removeCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the brackets:");
        String str = sc.nextLine();
        int result = countMinbrackets(str);
        System.out.println(result);

    }
}
