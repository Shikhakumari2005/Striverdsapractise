
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.sql.rowset.serial.SQLOutputImpl;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
      this.val=val;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
        if(root ==null) return  result;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0; i<size;i++){
                TreeNode curr=q.poll();
              //  if (curr == null) continue;
                level.add(curr.val);
                if(curr.left!=null) q.offer(curr.left);
                if(curr.left!=null) q.offer(curr.right);
            }
            result.add(level);
        }
        return result;
    }
    public static void main(String[] args){
        Node root=new Node(2);
        Node a=new Node(3);
        Node b=new Node(5);
        root.L=a;
        root.R=b;
     //Node root=new Node(2);
        Node c=new Node(6);
        Node d=new Node(7);
        a.L=c;
        b.R=d;
        List<List<Integer>> result = levelOrder(root);

        // Printing result properly
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}

