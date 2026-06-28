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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (subRoot == null)
            return true;

        if (root == null)
            return false;

        if (root.val == subRoot.val && isIdentical(root, subRoot))
            return true;

        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    public boolean isIdentical(TreeNode r, TreeNode s) {

        if (r == null && s == null)
            return true;

        if (r == null || s == null)
            return false;

        boolean isLeft = isIdentical(r.left, s.left);
        boolean isRight = isIdentical(r.right, s.right);

        return isLeft && isRight && r.val == s.val;
    }

    public static void main(String[] args){
        TreeNode root =new TreeNode(1);
        root.left =new TreeNode(2);
        root.right =new TreeNode(3);
        root.left.left =new TreeNode(4);
        root.left.right =new TreeNode(5);
        root.right.left =new TreeNode(6);
        root.right.left =new TreeNode(8);
    
        TreeNode subRoot =new TreeNode(1);
        subRoot.left = new TreeNode(2);
        subRoot.right = new TreeNode(3);
        subRoot.left.left = new TreeNode(4);
    //subRoot.right.left = new TreeNode(2);
        subRoot.left.right= new TreeNode(5);
        Solution obj = new Solution();

        boolean ans = obj.isSubtree(root, subRoot);

        System.out.println(ans);
    }

}