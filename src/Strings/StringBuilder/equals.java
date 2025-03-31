package Strings.StringBuilder;

public class equals {
    public static void main(String[] args) {
        String a = "abcxyz";
        String b = "abc";
        b = b+"xyz";
        String s = "abcxyz";
        String c = new String(a);
        System.out.println(a==b);  // here this is false because it is not pointing to the string a
        System.out.println(a==s);  // this is true because s points to the string 'a'.
        System.out.println(a==c);  // here this is false because it is not pointing to the string a
        System.out.println();


        // now if we use equals operator than it will check character by char then gives the answer

        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(s)); // true
        System.out.println(a.equals(c)); // true
    }
}
