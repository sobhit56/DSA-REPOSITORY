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
    public int noOfPaths(TreeNode root, long tsum){
        if(root == null) return 0;
        int count = 0;
        if(root.val == tsum) count++;
        return count+  noOfPaths(root.left, tsum-root.val)+  noOfPaths(root.right, tsum-root.val);
    }
    public int pathSum(TreeNode root, int tsum) {
        if(root == null) return 0;
        int count = noOfPaths(root, (long)tsum);
        count +=  (pathSum(root.left,  tsum)+  pathSum(root.right, tsum));
        return count;
    }
}