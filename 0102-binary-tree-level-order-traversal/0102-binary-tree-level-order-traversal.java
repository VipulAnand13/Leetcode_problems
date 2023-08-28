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
import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> q= new LinkedList<>();
        List<List<Integer>> finalList=new ArrayList<List<Integer>>();
        List<Integer> list= new ArrayList<>();
        
        if(root==null) return finalList;
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            TreeNode cur= q.poll();
            
            if(cur!= null){
                list.add(cur.val);
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
             }
            
            else{
                //q.add(null);
                finalList.add(list);
                // the next two lines added and first line commented but both worked. Just doing to improve time
                if(q.isEmpty()) return finalList; 
                q.add(null);
                list= new ArrayList<Integer>();
            }
            
           // if(cur==null && q.peek()==null) break;
        }
        return finalList;
    }
}