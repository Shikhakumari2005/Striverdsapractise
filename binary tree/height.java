class TreeNode{
    int val;
    TreeNode l;
    TreeNode r;

    public  TreeNode(int val){
        this.val=val;
        this.l=null;
        this.r=null;
    }
}

class height {
    public static int Height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = Height(root.l);
        int right = Height(root.r);
        return 1 +Math.max(left ,right);
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(1);
        root.l = new TreeNode(2);
        root.r = new TreeNode(3);
        root.l.l = new TreeNode(4);

        //height sol = new height();

        System.out.println(Height(root));
    }
}
