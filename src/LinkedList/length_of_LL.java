package LinkedList;

public class length_of_LL {
    static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        System.out.println("length of ll: "+length(a));
    }
}
