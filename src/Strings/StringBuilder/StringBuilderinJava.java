package Strings.StringBuilder;

public class StringBuilderinJava {
    public static void main(String[] args) {

        // this is an empty string, its capacity is 16 which means an empty srting has a capacity of 16
        String s = "";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println();

        System.out.println("With char");

        // here stringbuilder is not empty and it contains 3 char so it will be simply added to 16 that gives 19
        StringBuilder b = new StringBuilder("abc");
        System.out.println(b);
        System.out.println(b.length());
        System.out.println(b.capacity());
        System.out.println();

        System.out.println("With int value ");


        // here the stringbuilder contains a digit be will eventually become it capacity
        StringBuilder a = new StringBuilder(10);
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.capacity());

    }
}
