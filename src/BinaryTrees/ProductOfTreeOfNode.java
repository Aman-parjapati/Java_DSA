package BinaryTrees;

public class ProductOfTreeOfNode {
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
        System.out.print(root.val+" ");;
        display(root.left);
        display(root.right);
    }

    static int TreeProduct(Node root){
        if(root == null) return 1;
        return root.val*TreeProduct(root.left)*TreeProduct(root.right);
    }
    static int NonZeroProduct(Node root){
        if(root == null) return 1;
        int currentVal;
        if (root.val == 0) currentVal = 1;
        else currentVal = root.val;
        return currentVal*NonZeroProduct(root.left)*NonZeroProduct(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(3);
        Node d = new Node(5);
        Node e = new Node(2);
        Node f = new Node(6);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        display(a);
        System.out.println();
        System.out.println(TreeProduct(a));
        System.out.println(NonZeroProduct(a));
    }
}
