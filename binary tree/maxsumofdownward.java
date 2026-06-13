
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public  TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

public class maxsumofdownward {
    //static int maxSum = Integer.MIN_VALUE;

    public static long subtreesum(TreeNode root){
        if(root==null){
            return 0;
        }
        long l = subtreesum(root.left);
        long r = subtreesum(root.right);
        long sum=root.val + Math.max(0 ,Math.max(l,r));
       return sum;  
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(-4);
        root.right.left = new TreeNode(2);
        root.right.right= new TreeNode(-4);
        System.out.println(subtreesum(root));
    }
}
