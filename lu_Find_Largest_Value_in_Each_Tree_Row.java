import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.LinkedList;

public class lu_Find_Largest_Value_in_Each_Tree_Row {
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
    public List<Integer> largestValues(TreeNode root) {
       if(root == null){
           return new ArrayList<>();
       }
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int len = que.size();
            int max = -2147483648;
            for(int i = 0;i < len;i++){
                TreeNode tempNode = que.poll();
                if(tempNode.val > max){
                    max = tempNode.val;
                }
                if(tempNode.left != null){
                    que.offer(tempNode.left);
                }
                if(tempNode.right != null){
                    que.offer(tempNode.right);
                }
            }
            res.add(max);
        }
        return res;
    }
}
