import java.util.List;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayList;
//很重要 一层一层去遍历 用for循环控制一层 保证将每层的最后一个加入res

public class lu_Binary_Tree_Right_Side_View {
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
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> que = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        que.offer(root);
        while(!que.isEmpty()){
            int size = que.size();
            for(int i = 0;i < size;i++){
                TreeNode poll = que.poll();
                if(poll.left != null){
                    que.offer(poll.left);
                }
                if(poll.right != null){
                    que.offer(poll.right);
                }
                if(i == size - 1){
                    res.add(poll.val);
                }
            }
        }
        return res;
    }
}
