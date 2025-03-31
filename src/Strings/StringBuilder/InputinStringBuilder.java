package Strings.StringBuilder;

import java.util.Scanner;

public class InputinStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Method 1
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);

        // Method 2
        StringBuilder ssb = new StringBuilder(sc.nextLine());
        System.out.println(ssb);
    }
}
