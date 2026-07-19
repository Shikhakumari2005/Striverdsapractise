class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class kthlevel {
    public static void KthLeveL(TreeNode root ,int k){
        
        if(root==null){
            return;
        }
        if(k==1){
            System.out.println(root.val); 
            return;
        }
        KthLeveL(root.left, k-1);
        KthLeveL(root.right, k-1);
    }
    

    public static void main(String[] args) {
        TreeNode root =new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right= new TreeNode(6);
        int k=3;
        KthLeveL(root,k);
    }
}
