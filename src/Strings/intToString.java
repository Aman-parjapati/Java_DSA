package Strings;

import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String s = "";
        s = s+x;
        System.out.println(s);
        int num = 42;
        String str = Integer.toString(num);
        System.out.println(str);
    }
}
