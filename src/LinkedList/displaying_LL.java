// to display the data we can use sout(a.next.data) which long method
// or  we can use loop to display the values
// or we can use function/ method
package LinkedList;

public class displaying_LL {

    static class Node{
        int val;
        Node next;
        Node(int data){
            this.val =data;
        }
    }
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
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
        display(a);
//        Node temp = a;
//        for (int i = 1; i <=5; i++) {  // if only the top node is give and the no of node are unknown then for loop is invalid
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }

    }
}
