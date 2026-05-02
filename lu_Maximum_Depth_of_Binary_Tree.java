import java.util.Deque;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class lu_Maximum_Depth_of_Binary_Tree {
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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Deque<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int res = 0;
        while(!que.isEmpty()){
            res++;
            int len = que.size();
            for(int i = 0;i < len;i++){
                TreeNode tempNode = que.poll();
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
