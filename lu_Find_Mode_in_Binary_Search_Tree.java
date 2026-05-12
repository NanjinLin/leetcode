import java.util.*;

public class lu_Find_Mode_in_Binary_Search_Tree {
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
   ArrayList<Integer> reslist;
    int maxCount = 0;
    int count = 0;
    TreeNode pre = null;
    public int[] findMode(TreeNode root) {
        reslist = new ArrayList<>();
        findMode1(root);
        int[] res = new int[reslist.size()];
        for(int i = 0;i < reslist.size();i++){
            res[i] = reslist.get(i);
        }
        return res;
    }
    public void findMode1(TreeNode root){
        if(root == null){
            return;
        }
        //左
        findMode1(root.left);
        //中
        int rootValue = root.val;
        if(pre == null || rootValue != pre.val){
            count = 1;
        }else {
            count++;
        }
        if(count > maxCount){
            reslist.clear();
            reslist.add(rootValue);
            maxCount = count;
        }else if(count == maxCount){
            reslist.add(rootValue);
        }
        pre = root;
        //右
        findMode1(root.right);
    }
}
