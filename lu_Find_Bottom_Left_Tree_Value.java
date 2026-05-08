import java.util.*;

public class lu_Find_Bottom_Left_Tree_Value {
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
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> que = new LinkedList<>();
        if(root == null){
            return 0;
        }
        que.offer(root);
        int res = root.val;
        while(!que.isEmpty()){
            int len = que.size();
            for(int i = 0;i < len;i++){
                TreeNode tempNode = que.poll();
                if(i == 0){
                    res = tempNode.val;
                }
                if(tempNode.left != null){
                    que.offer(tempNode.left);
                }
                if(tempNode.right != null){
                    que.offer(tempNode.right);
                }
            }
        }
        return res;
    }
}
