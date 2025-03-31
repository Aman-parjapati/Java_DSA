package LinkedList.Doubly_And_CircularLL;

public class DLL_Insertion {
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
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    static Node INSERTatHEAD(Node head, int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    static void INSERTatEND(Node head, int x){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
        temp =t;
    }

    static void INSERTatAnyIDX(Node head,int idx, int x){
        Node s = head;
        for (int i = 1; i <=idx-1 ; i++) {
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;

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
        Node newHead = INSERTatHEAD(a,90);
        display(newHead);
        System.out.println();

        INSERTatEND(a,50);
        display(a);
        System.out.println();

        INSERTatAnyIDX(a,3,56);
        display(a);
    }
}
