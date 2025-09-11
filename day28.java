class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) &&
               isMirror(t1.left, t2.right) &&
               isMirror(t1.right, t2.left);
    }
}


Problem : Check if a Binary Tree is Symmetric
You are given the root of a binary tree. Your task is to determine whether the tree is symmetric. A binary tree is symmetric if the left and right subtrees are mirror images of each other.

Input :
* The root of the binary tree.
* Input : [1, 2, 2, 3, 4, 4, 3]

Output :
Return true if the binary tree is symmetric, otherwise return false.
Output: true
