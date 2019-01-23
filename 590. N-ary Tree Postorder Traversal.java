/*
Given an n-ary tree, return the postorder traversal of its nodes' values.
*/
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    List<Integer> postorderList= new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
        if(root!=null){
            for(Node n:root.children){
                postorder(n);
            }
         postorderList.add(root.val);
        }
        return postorderList;
    }
}
