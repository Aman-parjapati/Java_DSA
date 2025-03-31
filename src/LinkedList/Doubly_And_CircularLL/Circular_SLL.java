package LinkedList.Doubly_And_CircularLL;

public class Circular_SLL {

    // printing circular singly linked list

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    static void display(Node head){
        Node temp = head;

//        this will only print till 4 and if we use temp!=head then the temp is at head so no val
//        while(temp.next!=head){
//            System.out.print(temp.val+" ");
//            temp = temp.next;
//        }
        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);
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
        e.next = a;
        display(a);
    }
}
