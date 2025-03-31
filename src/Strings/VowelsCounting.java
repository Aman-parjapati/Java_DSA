package Strings;

import java.util.Scanner;

public class VowelsCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:");
        String str = sc.nextLine();
        int count = 0;
        for (int k = 0; k < str.length(); k++) {
            char ch = str.charAt(k);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        System.out.println(count);
    }
}
