package BitManipulation;

public class Basic {
    public static void main(String[] args) {
//        bitwise OR  --> |    means (0,0)->0   (0,1)->1    (1,0)->1    (1,1)->1
//        bitwise AND  --> &    means (0,0)->0   (0,1)->0    (1,0)->0    (1,1)->1
//        bitwise XOR ---> ^   means  (0,0)->0   (0,1)->1    (1,0)->1    (1,1)->0
//        x^x = 0,  x^0 = x, xor is associative
//        1's complement ---> ~  flip the number, formula ->  same no to -ve and subtract 1, eg. 15 -> -16
//        2's complement ---> 1's complement + 1
        System.out.println(5|9);
        System.out.println(5&11);
        System.out.println(5^11);
        System.out.println(~15);

//      nibble -> 4 bits, range -> -8 to 7 (16 numbers)
//      byte -> 8 bits, range -> -2^7 to 2^7 - 1
//      short -> 16 bits, range -> -2^15 to 2^15 - 1
//      int -> 32 bits, range -> -2^31 to 2^31-1
//      long -> 64 bits, range -> -2^63 to 2^63-1

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println();

//        a>>2  right shift by 2
//        a<<2  left shift by 2
        System.out.println(91>>2);
        System.out.println(4<<2);
    }
}
