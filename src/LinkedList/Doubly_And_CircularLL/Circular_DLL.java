package LinkedList.Doubly_And_CircularLL;

public class Circular_DLL {
    static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    static void display(Node head){
        Node temp = head;
        do{
            System.out.print(temp.val+" ");
            temp = temp.next;
        }while(temp!=head);
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(8);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = a;
        a.prev = e;
        display(a);
    }
}
