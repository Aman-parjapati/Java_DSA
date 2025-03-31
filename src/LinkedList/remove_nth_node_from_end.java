package LinkedList;

public class remove_nth_node_from_end {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }

    static void displayll(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node deletenode(Node head, int n){
        Node fast = head;
        Node slow = head;
        for (int i = 1; i <= n; i++) {
            fast= fast.next;
        }
        if(fast==null) {
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
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
//        Node abc = removenthnode(a,5);
//        System.out.println(abc.data);
        displayll(a);
        a=deletenode(a,7);
        displayll(a);
        a=deletenode(a,6);
        displayll(a);
    }
}
