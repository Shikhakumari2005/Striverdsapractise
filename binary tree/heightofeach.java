import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class heightofeach {

    public static int Height(TreeNode root, ArrayList<Integer> ans) {

        if (root == null) {
            return 0;
        }

        int l = Height(root.left, ans);
        int r = Height(root.right, ans);

        int height = 1 + Math.max(l, r);

        ans.add(height);

        return height;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        ArrayList<Integer> ans = new ArrayList<>();

        int h = Height(root, ans);

        System.out.println("Height of tree = " + h);
        System.out.println("Height of each node (postorder): " + ans);
    }
}