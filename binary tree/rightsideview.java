import java.util.Stack;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val=val;
    }
}
class Pair {
    TreeNode node;
    int hd;

    Pair(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
class  rightsideview{
    public static List<Integer> topsee(TreeNode a){
        List<Integer> ans = new ArrayList<>();

        if (a == null){
            return ans;
        }

        TreeMap<Integer, Integer> mp = new TreeMap<>();

        Stack<Pair> q = new Stack<>();

        q.push(new Pair(a, 0));
        while(!q.isEmpty()){
            Pair current = q.pop();
            TreeNode cur = current.node;
            int hd = current.hd;
            if(!mp.containsKey(hd)){
                mp.put(hd, cur.val);
            }
            if(cur.left!=null){
                q.push(new Pair(cur.left ,hd+1));
            }
            if(cur.right!=null){
                q.push(new Pair(cur.right ,hd+1));
            }
        }
        ans.addAll(mp.values());

        return ans;
    }
    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        a.left=new TreeNode(2);
        a.right=new TreeNode(3);
        a.left.right=new TreeNode(4);
        a.right.left=new TreeNode(5);
        a.right.right=new TreeNode(6);
        System.out.println(topsee(a));
    }
}
