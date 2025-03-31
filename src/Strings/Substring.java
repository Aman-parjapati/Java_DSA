package Strings;

public class Substring {
    public static void main(String[] args) {
        String s = "abcde";
        // this will print --> index 2 and uske aage wala
        System.out.println(s.substring(2));
        // ye 2 se leke index 5 tak ke saare print kardega
        System.out.println(s.substring(2,5));
        // ye 2 se le kar ke 2 tak mltb kuch bhi print nhi karega
        System.out.println(s.substring(2,2));
        System.out.println(s.substring(0,5));
    }
}
