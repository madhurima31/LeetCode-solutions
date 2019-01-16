
/*
A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {

        boolean leftCheck = (root.left==null || root.val==root.left.val && isUnivalTree(root.left));
        boolean rightCheck = (root.right==null || root.val==root.right.val &&
                            isUnivalTree(root.right) );

        return leftCheck && rightCheck;
    }
}
