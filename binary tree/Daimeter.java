class TreeNode{
    int val;
    TreeNode l;
    TreeNode r;
    public TreeNode(int val){
        this.val=val;
    }
}
public class Daimeter {
    static int diameter(TreeNode root){
        if(root==null){
            return 0;
        }
        int lefthieght=height(root.l);
        int rightheight=height(root.r);
        int dia=lefthieght +rightheight;
        return Math.max(dia , Math.max(diameter(root.l) ,diameter(root.r)));
    }
    static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return  1 + Math.max(height(root.l) ,height(root.r));
    }
    public static void main(String[] args) {
        TreeNode root =new TreeNode(1);
        root.l = new TreeNode(2);
        root.r = new TreeNode(3);
        root.l.l = new TreeNode(4);
        root.r.l = new TreeNode(5);
        root.r.r= new TreeNode(6);
        System.out.println(diameter(root));
    }
}
