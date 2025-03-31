package LinkedList;

public class DELETEatINDEX {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class linkedlist{
        Node head = null;
        Node tail = null;
        int length = 0;
        void insertATbegnning(int val){
            Node temp = new Node(val);
            if (head == null){
                head=tail=temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            length++;
        }
        void InsertAtidx(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if (idx==0){
                insertATbegnning(val);
                return;
            }
            else if(idx<0 && idx>length) {
                System.out.println("Invalid");
                return;
            }
            for (int i = 1; i <=idx-1 ; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            length++;
        }
        void Display (){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertATbegnning(2);
        ll.insertATbegnning(4);
        ll.insertATbegnning(6);
        ll.Display();

    }
}
