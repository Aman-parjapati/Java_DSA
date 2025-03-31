package LinkedList;

public class displaying_LL_byRECURSION {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static void displayr(Node head){
        if(head==null) return;
        System.out.print(head.data+ " ");
        displayr(head.next);

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        displayr(a);
    }
}
