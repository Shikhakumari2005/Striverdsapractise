import java.util.ArrayList;
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

class SubtreeSum {
    static int maxSum = Integer.MIN_VALUE;

    public static int subtreesum(TreeNode root ,ArrayList<Integer> res){
        if(root==null){
            return 0;
        }
        int l = subtreesum(root.left ,res);
        int r = subtreesum(root.right ,res);
        int sum=root.val + l + r;
        res.add(sum);
       //System.out.println(res.add(sum));
       System.out.println("Current list: " + res);
       maxSum = Math.max(maxSum, sum);;
       return maxSum;  
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        //height sol = new height();
        ArrayList<Integer> res=new ArrayList<>();

        // System.out.println(Height(root ,res));
        int totalSum = subtreesum(root, res);

        System.out.println("Total Tree Sum = " + totalSum);
        System.out.println("Subtree Sums = " + res);
    }
}
