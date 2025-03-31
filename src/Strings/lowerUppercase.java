package Strings;

public class lowerUppercase {
    public static void main(String[] args) {
        String s = "AMAN is 24X7 cool";
        System.out.println(s.toLowerCase());

        // do not use this---
//        s.toLowerCase();     doesnot do anything;
        // we can create a new var and store then print it or can use the same one
        s = s.toLowerCase();
        System.out.println(s);
        String a = s.toLowerCase();
        System.out.println(a);
        System.out.println(s.toUpperCase());
        System.out.println();



        String b = "abc";
        String x = "xyz";
        System.out.println(x+b);
        System.out.println(x.concat(b));

    }
}
