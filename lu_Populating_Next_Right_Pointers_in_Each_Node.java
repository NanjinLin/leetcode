import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class lu_Populating_Next_Right_Pointers_in_Each_Node {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Deque<Node> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int len = que.size();
            for(int i = 0;i < len;i++){
                Node tempNode = que.poll();
                if(i != len - 1){
                    tempNode.next = que.peek();
                }else {
                    tempNode.next = null;
                }
                if(tempNode.left != null){
                    que.offer(tempNode.left);
                }
                if(tempNode.right != null){
                    que.offer(tempNode.right);
                }
            }
        }
        return root;
    }
}
