import java.util.List;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayList;

public class lu_Nary_Tree_Level_Order_Traversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }
        Deque<Node> que = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int len = que.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i < len;i++){
                Node tempNode = que.poll();
                list.add(tempNode.val);
                if(tempNode.children != null){
                    for(int j = 0;j < tempNode.children.size();j++){
                        que.offer(tempNode.children.get(j));
                    }
                }
            }
            res.add(list);
        }
        return res;
    }
}
