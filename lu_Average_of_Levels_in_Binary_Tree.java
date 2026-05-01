import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class lu_Average_of_Levels_in_Binary_Tree {
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Deque<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            double ave = 0.0;
            int len = que.size();
            for(int i = 0;i < len;i++){
                TreeNode poll = que.poll();
                ave += poll.val;
                if(poll.left != null){
                    que.offer(poll.left);
                }
                if(poll.right != null){
                    que.offer(poll.right);
                }
            }
            res.add(ave / len);
        }
        return res;
    }
}
