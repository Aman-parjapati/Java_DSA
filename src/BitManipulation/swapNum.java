package BitManipulation;

public class swapNum {
    public static void main(String[] args) {
        int a = 5, b = 4;
//        method 1
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a+" "+b);

//        method 2 -> without using any extra variable
//        a = a+b;
//        b = a-b;
//        a = a-b;
//        System.out.println(a+" "+b);

//        method 3 -> using bit manipulation
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+" "+b);
    }
}
