import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
//二叉树的层序遍历


public class lu_BInary_Tree_Level_Order_Traversal {
    static class TreeNode {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
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
        return res;
    }
}
