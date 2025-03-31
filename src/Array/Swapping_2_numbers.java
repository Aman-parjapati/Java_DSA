package Array;

public class Swapping_2_numbers {
    static void Main(int a, int b){
        System.out.println("Original values of a :" + a);
        System.out.println("Original values of b :" + b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("values after swap a:" + a);
        System.out.println("values after swap b:" + b);

    }
    public static void main(String[] args) {
        int a= 9;
        int b= 3;
        Main(a,b);
    }
}
