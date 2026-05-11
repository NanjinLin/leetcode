public class lu_Minimum_Absolute_Difference_in_BST {
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
    //采用中序遍历
    //记录上一个遍历的节点
    TreeNode pre;
    int res = 114514;
    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return 0;
        }
        traversal(root);
        return res;
    }
    public void traversal(TreeNode root){
        if(root == null){
            return;
        }
        //左
        traversal(root.left);
        //中
        if(pre != null){
            res = Math.min(res , root.val - pre.val);
        }
        pre = root;
        //右
        traversal(root.right);
    }
}
