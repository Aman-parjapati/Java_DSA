package Array;

public class Swap_using_sum_difference {
    static void Main(int a, int b){
        System.out.println("Original values of a: "+ a);
        System.out.println("Original values of b: "+ b);
        a=a+b;   // this will give the total sum and save it in a
        b=a-b;   // here the value of a will be the total sum of a+b and when we will subtract b from that ==> b=a+b-b=a; hence the values are swapped
        a=a-b;  // same goes for this one
        System.out.println("Swapped values are ");
        System.out.println("a:" +a);
        System.out.println("b:"+b);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        Main(a,b);
    }
}
