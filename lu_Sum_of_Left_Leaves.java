import java.util.LinkedList;
import java.util.Deque;

public class lu_Sum_of_Left_Leaves {
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
    public int sumOfLeftLeaves(TreeNode root) {
        Deque<TreeNode> que = new LinkedList<>();
        if(root == null){
            return 0;
        }
        int res = 0;
        que.offer(root);
        while(!que.isEmpty()){
            int len = que.size();
            for(int i = 0;i < len;i++){
                TreeNode tempNode = que.poll();
                if(tempNode.left != null){
                    que.offer(tempNode.left);
                }
                if(tempNode.left != null && tempNode.left.left == null && tempNode.left.right == null){
                    res += tempNode.left.val;
                }
                if(tempNode.right != null){
                    que.offer(tempNode.right);
                }
            }
        }
        return res;
    }
}
