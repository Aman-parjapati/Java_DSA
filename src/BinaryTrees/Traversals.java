package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Traversals {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    // This is DFS and known as Euler rule tree  --> pre,in,post order
    // level order traversal is BFS using queues

    // for reverse preorder--> Root, Right, left
    static void Preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");  // time complexity: O(n),
        Preorder(root.left);             // Space complexity: worst case-->O(n) best case-->O(h)
        Preorder(root.right);
    }  // Preorder--> Root, left, Right

    // for reverse inorder--> right, Root, left
    static void Inorder(Node root){
        if(root == null) return;
        Inorder(root.left);
        System.out.print(root.val+" ");
        Inorder(root.right);
    }  // Inorder--> Left, Root, Right

    // morris traversal valid only for inorder
    public static List<Integer> inorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        Node curr = root;
        while(curr != null){
            if(curr.left != null){ // left exist karta hai
                // find predecessor
                Node pred = curr.left;
                while(pred.right != null && pred.right != curr)
                    pred = pred.right;
                //  link pred to curr
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }
                // pred.right = curr : unlink pred and curr
                else{
                    pred.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
            else{ // left exist nhi karta hai
                ans.add(curr.val);
                curr = curr.right;
            }
        }
        return ans;
    }

    // for reverse postorder--> Right, left, root
    static void Postorder(Node root){
        if(root == null) return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.val+" ");
    } // PostOrder--> Left, Right, Root

//    level Order traversal using queues
    static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(q.size()>0){ // this left to right level order traversal
            for (int i = 0; i < q.size(); i++) {
                Node front = q.remove();
                System.out.print(front.val+" ");
                if(front.left != null) q.add(front.left);
                if(front.right != null) q.add(front.right);
            }
        }
        System.out.println();
//        while(q.size()>0){  // this right to left level order traversal
//            Node front = q.remove();
//            if(front.left != null) q.add(front.left);
//            if(front.right != null) q.add(front.right);
//            System.out.print(front.val+" ");  ....

//        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        a.left = b;  a.right = c;
        b.left = d;  b.right = e;
        c.left = f;  c.right = g;
        g.left = h;  g.right = i;
        System.out.print("Preorder: ");
        Preorder(a);
        System.out.println();
        System.out.print("Inorder: ");
        Inorder(a);
        System.out.println();
        System.out.print("Postorder: ");
        Postorder(a);
        System.out.println();
        System.out.print("Level Order: ");
        levelOrder(a);
        System.out.print("Morris Inorder Order: ");
        System.out.println(inorderTraversal(a));

    }

}
