package LinkedList.Doubly_And_CircularLL;

public class DLLDisplay {
    static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
//     displaying the dll
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
//  displaying dll in reverse
    static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
//    for displaying the entire dll for the random element(i.e without having head and tail)
    static void displayrandom(Node random){
        Node temp = random;
        // for going back to head node
        while(temp.prev!=null){
            temp = temp.prev;
        }
        // for displaying the ll
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        display(a);
        displayrev(e);
        displayrandom(c);
    }
}
