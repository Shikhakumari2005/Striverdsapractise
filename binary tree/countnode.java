// class TreeNode{
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int val) {
//         this.val = val;
//         // this.left = left;
//         // this.right = right;
//     }
// }
// class countnode{
//     public int countNodes(TreeNode root) {
//         if (root ==null){
//             return 0;
//         }
//         int l=countNodes(root.left);
//         //countNodes(root.left);
//         int r=countNodes(root.right);
//         return  (l+r)+1;
        
//     }
//     public static void main(String[] args){
//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);

//         countnode sol = new countnode();

//         System.out.println(sol.countNodes(root));

//     }
// }


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class countnode {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = countNodes(root.left);
        int r = countNodes(root.right);

        return l + r + 1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        countnode sol = new countnode();

        System.out.println(sol.countNodes(root));
    }
}
