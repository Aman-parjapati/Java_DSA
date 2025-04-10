package BitManipulation;

public class powerof2 {
    public static void main(String[] args) {
        System.out.println(1<<0);  // using left shift operator
        System.out.println(1<<1);
        System.out.println(1<<2); // tc = O(1)
        System.out.println(1<<12);  // 1<<k is power of 2

//          for a number be to power of 2 we can do (n & n-1) == 0  ->returns true or false
    }
}
