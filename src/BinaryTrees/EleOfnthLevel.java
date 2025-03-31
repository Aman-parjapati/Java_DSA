package BinaryTrees;

import java.util.Scanner;

public class EleOfnthLevel {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    static void nthLevel(Node root, int level, int lvl){
        if(root == null) return;
        if(level == lvl)System.out.print(root.val+" ");
        nthLevel(root.left, level+1, lvl);
        nthLevel(root.right, level+1, lvl);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
//        System.out.print("enter n: ");
//        nthLevel(a,0);
//        System.out.println();

        for (int x = 0; x <=3; x++) { // this loop print the nodes of the tree--> level order traversal without queues--> DFS
            nthLevel(a,0,x);
            System.out.println();
        }
    }
}
