/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode parent=null;
        TreeNode cur= root;
        
        while(cur!=null){
            parent=cur;
            if(cur.val>val) cur= cur.left;
            else cur= cur.right;
        }
        
        cur= new TreeNode(val);
        if(cur.val >parent.val) parent.right=cur;
        else parent.left=cur;
        return root;
    }
}