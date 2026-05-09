public class lu_Search_in_a_Binary_Search_Tree {
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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode res = null;
        while(root != null){
            if(root.val == val){
                res = root;
                break;
            }
            if(root.val > val){
                root = root.left;
            }else {
                root = root.right;
            }
        }
        return res;
    }
}
