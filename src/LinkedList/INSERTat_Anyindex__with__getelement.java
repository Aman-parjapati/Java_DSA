package LinkedList;

// get element method means printing an element form ll at any idx when called

public class INSERTat_Anyindex__with__getelement {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static class linkedlist{
        int length=0;
        Node head = null;
        Node tail = null;
        void Insertatbeggining(int val){
            Node temp = new Node(val);
            if(head==null){
                head =tail=temp;
            }
            else{
                temp.next=head;
                head = temp;
            }
            length++;
        }
        void insertAT(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==0) {
                Insertatbeggining(val);
                return;
            }
            else if (idx<0) {
                System.out.println("-ve idx not allowed");
                return ;
            }
            else if (idx>length) {
                System.out.println("idx is greater than the size");
                return;
            }
//             else if (idx==length()) {  // this will print the last data of the linked list if we call directly
//                INSERTatEnd(val);  // without the func it will show the last element as per the 1st ll
//                return;  // which is 30->2->50->5
            for (int i = 1; i <=idx-1 ; i++) {
                temp = temp.next;
            }
            t.next=temp.next;
            temp.next = t;
            length++;
        }
        int getAt(int idx){    // means printing any element in the linked list using the index
            Node temp = head;
            for (int i = 0; i <idx; i++) {
                temp = temp.next;
            }
            if (idx<0) {
                System.out.println("-ve idx not allowed");
                return 0;
            }
            else if (idx>length) {
                System.out.println("idx is greater than the size");
                return 0;
            }
            return temp.data;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.Insertatbeggining(5);
        ll.Insertatbeggining(50);
        ll.Insertatbeggining(30);
        ll.display();
        ll.insertAT(1,2); /// adding val at any idx
        System.out.println();
        ll.insertAT(4,2);
        ll.display();
        System.out.println();
        ll.Insertatbeggining(100);
        ll.display();
        System.out.println();
        System.out.println("length: "+ll.length);
//        System.out.println("last element ie tail is: "+ll.tail.data);  // for this one func is commented which require insertatend
        ll.insertAT(6,6);
        ll.display();
        System.out.println();
//        System.out.println("last element ie tail is: "+ll.tail.data);  // for this one func is commented which require insertatend
        System.out.println(ll.getAt(1));
    }
}
