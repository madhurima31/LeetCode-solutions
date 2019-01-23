/*
Given an n-ary tree, return the preorder traversal of its nodes' values.
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
    List<Integer> preorderList =new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        if(root!=null){
        preorderList.add(root.val);
        for(Node n: root.children){
          preorder(n);
        }
        }

     return preorderList;
    }
}

