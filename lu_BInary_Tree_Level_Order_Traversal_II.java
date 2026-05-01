import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class lu_BInary_Tree_Level_Order_Traversal_II {
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> que = new LinkedList();
        que.offer(root);
        while(!que.isEmpty()){
            int len = que.size();
            List<Integer> itemList = new ArrayList<>();
            while(len > 0){
                TreeNode tempNode = que.poll();
                itemList.add(tempNode.val);
                if(tempNode.left != null){
                    que.offer(tempNode.left);
                }
                if(tempNode.right != null){
                    que.offer(tempNode.right);
                }
                len--;
            }
            res.add(itemList);
        }
        List<List<Integer>> res2 = new ArrayList<>();
        for(int i = res.size() - 1;i >= 0; i--){
            res2.add(res.get(i));
        }
        return res2;
    }
}
