package Stacks;

public class LinkedListImplemenation {

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    static class Stack{
        Node head = null;
        private int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head == null) {
                System.out.println("Stack is empty!!");
                return -1;
            }
            else{
                int x = head.val;
                head = head.next;
                size--;
                return x;
            }
        }
        int peek(){
            if (head == null) {
                System.out.println("Stack is empty!!");
                return -1;
            }
            return head.val;
        }
        void displayrecursive(Node h){
            if(h == null) return;
            displayrecursive(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrecursive(head);
            System.out.println();
        }
        // for displaying reverse
        void displayreverse(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if (head==null) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(7);
        st.display();
        st.pop();
        st.display();
        st.push(10);
        st.display();
        System.out.println(st.size());
        st.push(1);
        st.display();
        System.out.println(st.size);
    }
}
