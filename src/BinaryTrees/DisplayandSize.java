package BinaryTrees;

public class DisplayandSize {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    static int size(Node root){  // size == count total nodes..
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(5);
        Node e = new Node(2);
        Node f = new Node(6);
        a.left = b;  a.right = c;
        b.left = d;  b.right = e;
        c.right = f;
        display(a);
        System.out.println();
        System.out.println(size(a));
    }
}
