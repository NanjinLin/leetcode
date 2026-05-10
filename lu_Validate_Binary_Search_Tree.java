import java.util.*;

public class lu_Validate_Binary_Search_Tree {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
    }
    public boolean isValidBST(TreeNode root) {
        return check(root,Long.MIN_VALUE , Long.MAX_VALUE);
    }
    public boolean check(TreeNode node , long min, long max){
        if(node == null){
            return true;
        }
        if(node.val <= min || node.val >= max){
            return false;
        }
        boolean left = check(node.left , min , node.val);
        boolean right = check(node.right,node.val,max);
        return left && right;
    }
}
