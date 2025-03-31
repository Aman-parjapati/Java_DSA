package LinkedList;

public class INSERTatBEGINING {
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static class linkedlist{
        Node head = null;
        Node tail = null;
        void Insertatbeggining(int val){
            Node temp = new Node(val);
            if(head==null) head =tail=temp;
            else{
                temp.next=head;
                head = temp;
            }
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

        int length(){
            Node temp = head;
            int count=0;
            while(temp!=null){
                count++;
                temp= temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.Insertatbeggining(500);
        ll.Insertatbeggining(65);
        ll.display();
        System.out.println();
        System.out.println(ll.length());
        ll.Insertatbeggining(32);
        ll.display();
    }
}
