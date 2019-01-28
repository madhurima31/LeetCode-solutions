/*
Given a tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree,
and every node has no left child and only 1 right child.
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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode result=new TreeNode(0);
        TreeNode curr= result;
        List<Integer> nodeValList = new ArrayList<Integer>();
        inorder(root, nodeValList);
        for(Integer n : nodeValList){
            curr.right=new TreeNode(n);
            curr=curr.right;

        }
        return result.right;
    }
    public static void inorder(TreeNode node, List<Integer> list){
        if(node!=null){
            inorder(node.left,list);
            list.add(node.val);
            inorder(node.right,list);
        }
    }
}
