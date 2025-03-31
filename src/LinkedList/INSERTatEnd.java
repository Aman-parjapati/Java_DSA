package LinkedList;

public class INSERTatEnd {
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
        void insertATend(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int length(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertATend(5);
        ll.insertATend(12);
        ll.display();
        System.out.println();
        System.out.println("length of the ll: "+ll.length());
        ll.insertATend(50);
        ll.display();
    }
}
