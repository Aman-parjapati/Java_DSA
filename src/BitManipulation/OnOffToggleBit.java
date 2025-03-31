package BitManipulation;

public class OnOffToggleBit {
    // to turn on/ set kth bit, kth bit should be 1
//    public static void main(String[] args) {
//        System.out.println(on(5,3));
//    }
//    static int on(int a, int k){
//        return a | (1<<k);
//    }

    // to turn off/ set off -> kth bit = 0
//    public static void main(String[] args) {
//        System.out.println(off(11,3));
//    }
//    static int off(int a, int k){
//        return a & (~(1<<k));
//    }

    // to toggle/ on-off a bit
    public static void main(String[] args) {
        System.out.println(toggle(11,3));
    }
    static int toggle(int a, int k){
        return a^(k<<1);
    }
}
