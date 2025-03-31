package LinkedList;
public class linkingNODES {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data; // here this.data shows the data from the method and it is = to data. here this data it the is this funcs data
        }
    }
    public static void main(String[] args) {
//        Node x = new Node();
//        System.out.println(x.data);// this prints the default value which is 0
//        System.out.println(x);// this is printing the address of the node
//        System.out.println(x.next); // this printing the next value present in the ll
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        System.out.println(a.data);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(a.next);// this is printing the address of the node which is b  System.out.println(b);// printing address of b is same as printing address of a.next
        System.out.println(a.next.data);
        System.out.println(b.next);
        System.out.println(b.next.data);// this will print the value of c
        System.out.println(a.next.next.data); // this will also print the value of c
    }
}
