/*
Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       List<Integer> leaves1=new ArrayList<Integer>();
        List<Integer> leaves2 = new ArrayList<Integer>();
        dfs(root1,leaves1);
        dfs(root2,leaves2);

        return leaves1.equals(leaves2);
    }

    public static void dfs(TreeNode root, List<Integer> leaves){

        if(root!=null){
        if(root.left==null && root.right==null)
            leaves.add(root.val);

        dfs(root.left,leaves);
        dfs(root.right,leaves);
        }
    }
}
