package BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TraversalsIterative {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    static void preOrder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        if(root!=null) st.push(root);

        while(st.size()>0){  // time complexity = O(n), Space complexity = worst case-->O(n), Best case-->O(n)
            TreeNode front = st.pop();   // Auxiliary space = O(h) or O(log n);h=height of the tree
            System.out.print(front.val+" ");
            if(front.right!=null) st.push(front.right);  // if we use front.left here and front.right in line 23
            if(front.left!=null) st.push(front.left);    // it will print reverse
        }
    }

    static void postOrder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root!=null) st.push(root);

        while(!st.isEmpty()){  // here this entire code is preOrder but in reverse order ie [1 3 7 9 8 6 2 5 4]
            TreeNode front = st.pop();  // and [1 3 7 9 8 6 2 5 4] is reverse of postOrder
            list.add(front.val);
            if(front.left!=null) st.push(front.left);
            if(front.right!=null) st.push(front.right);
        }
        Collections.reverse(list);  // for reversing the list
        for(int ele:list){
            System.out.print(ele+" ");
        }
    }

    static void inOrder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        while(true){  // time and space complexity = O(n),
            if(temp!=null){   // auxiliary space = O(h) ie, for worst case = O(n), best case = O(log n)
                st.push(temp);
                temp = temp.left;
            } else{
                if(st.isEmpty()) break;
                TreeNode top = st.pop();
                System.out.print(top.val+" ");
                temp = top.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        a.left = b;  a.right = c;
        b.left = d;  b.right = e;
        c.left = f;  c.right = g;
        g.left = h;  g.right = i;
        System.out.print("Pre Order: ");
        preOrder(a);
        System.out.println();
        System.out.print("Post Order: ");
        postOrder(a);
        System.out.println();
        System.out.print("In Order: ");
        inOrder(a);
    }
}
