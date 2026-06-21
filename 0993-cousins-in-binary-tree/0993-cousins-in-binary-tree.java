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

 //if depthX == depthY && parentX != parentY  then cousin
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(q.size() > 0){
            int sz = q.size();
            boolean xfound = false;
            boolean yfound = false;
            for(int i = 0; i < sz; i++){
                TreeNode curr = q.remove();
                //depth check
                if(curr.val == x) xfound = true;
                if(curr.val == y) yfound = true;

                if(curr.left != null && curr.right != null){
                    if((curr.left.val == x && curr.right.val == y) || (curr.left.val == y && curr.right.val ==x)){
                        return false;
                    }
                }
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            if(xfound && yfound) return true;
            if(xfound || yfound) return false;

        }
        return false;
    }
}