public class lu_Insert_into_a_BInary_Search_Tree {
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
    //迭代法
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        TreeNode newRoot = root;
        TreeNode pre = root;
        while(root != null){
            pre = root;
            if(root.val > val){
                root = root.left;
            }else if(root.val < val){
                root = root.right;
            }
        }
        if(pre.val > val){
            pre.left = new TreeNode(val);
        }else {
            pre.right = new TreeNode(val);
        }
        return newRoot;
    }
    //递归法
    public TreeNode insertIntoBST2(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        if(root.val < val){
            root.right = insertIntoBST(root.right , val);
        }else if(root.val > val){
            root.left = insertIntoBST(root.left , val);
        }
        return root;
    }
}
