package BinaryTrees.BST;
public class countNoOfSubtree {
    static class Node {
        int val;
        Node left, right;
        Node(int x) {
            val = x;
        }
    }

    static boolean subtreeCnt(Node root, int low, int high, int[] ans) {
        if (root == null) return true;
        boolean left = subtreeCnt(root.left, low, high, ans);
        boolean right = subtreeCnt(root.right, low, high, ans);

        // If current subtree lies within range, then increment ans count and return true.
        if (root.val >= low && root.val <= high && left && right) {
            ans[0]++;
            return true;
        }
        // Else return false as this subtree is out of range.
        return false;
    }

    static int Cnt(Node root, int low, int high) {
        int[] ans = {0};
        subtreeCnt(root, low, high, ans);
        return ans[0];
    }

    public static void main(String[] args) {
        //         10
        //       /    \
        //     5       50
        //   /       /  \
        //  1       40   100
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(50);
        root.left.left = new Node(1);
        root.right.left = new Node(40);
        root.right.right = new Node(100);
        int low = 1, high = 45;

        System.out.println(Cnt(root, low, high));
    }
}
