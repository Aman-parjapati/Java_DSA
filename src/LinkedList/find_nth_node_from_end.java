package LinkedList;

public class find_nth_node_from_end {
     
//    fast and slow pointer method
    public static Node nthnode(Node head, int n){
        Node fast = head;
        Node slow = head;
        for (int i = 1; i <=n; i++) {
            fast = fast.next;
        }
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    // this method, this is making two traversal

    static Node nthnode2(Node head, int n){
        int size = 0;
        Node temp = head;
        while (temp!=null){
            size++;
            temp= temp.next;
        }
        int m = size-n+1;
        temp = head;
        for (int i = 1; i < m; i++) {
            temp = temp.next;
        }
        return temp;
    }

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(12);
        Node d = new Node(5);
        Node e = new Node(3);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node q = nthnode(a,2);
        Node g = nthnode2(a,2);
        System.out.println(q.data);
        System.out.println(g.data);
    }
}
