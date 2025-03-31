package BitManipulation;

public class BitMasking {
    public static void main(String[] args) {
//        bitmasking means check if kth bit is set or not
//        set -> 1, not/off/not set -> 0
//        how to make a mask?  -> making mask means -> if k=2 is given than mask will be  00000100
//        we can se k=2 is 1 that is masking
        // to make mask -> 1<<k ,(this will be always a power of 2)

        System.out.println(mask(11,3));
    }
    static boolean mask(int a, int k){
        return (a & 1<<k) != 0; // using bitwise and, xor operation
        // 1<<k -> 1<<4 means 1000
        // a & k<<2 -> 5 & 1000
        // 5 = 0100
        // 0100 & 1000 -> return false
    }
}
