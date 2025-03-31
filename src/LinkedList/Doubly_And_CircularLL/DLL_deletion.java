package LinkedList.Doubly_And_CircularLL;

public class DLL_deletion {

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
        while(temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    static Node DELETEhead(Node head){
        Node temp = head;
        head = head.next;
        head.prev = null;
        return head;
    }

//    static void DELETEatTAIL(Node head){
//        Node temp = head;
//        while(temp.next.next!=null){
//            temp = temp.next;
//        }
//        temp.next = null;
//    }

    static void DELETEatAnyIDX(Node head, int idx){
        Node temp = head;
        for (int i = 1; i <=idx-1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        a = DELETEhead(a);
        display(a);
        System.out.println();

//        DELETEatTAIL(a);
//        display(a);

        DELETEatAnyIDX(a,2);
        display(a);

    }
}
