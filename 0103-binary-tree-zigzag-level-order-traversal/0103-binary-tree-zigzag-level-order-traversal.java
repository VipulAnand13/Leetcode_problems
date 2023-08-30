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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        List<Integer> zigzag;
        if(root==null) return ans;
        ArrayDeque<TreeNode> s1= new ArrayDeque<>();
        ArrayDeque<TreeNode> s2= new ArrayDeque<>();
        TreeNode cur;
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()){
             zigzag= new ArrayList<Integer>();
            
            while(!s1.isEmpty()){
                cur= s1.pop();
                
                zigzag.add(cur.val);
                if(cur.left!=null) s2.push(cur.left);
                if(cur.right!=null) s2.push(cur.right);
            }
             if(zigzag.size()!=0) ans.add(zigzag);
             zigzag= new ArrayList<Integer>();
            while(!s2.isEmpty()){
                cur=s2.pop();
                
                zigzag.add(cur.val);
                if(cur.right!=null) s1.push(cur.right);
                if(cur.left!=null) s1.push(cur.left);
                
            }
            if(zigzag.size()!=0) ans.add(zigzag);
            
        }
        return ans;
    }
}