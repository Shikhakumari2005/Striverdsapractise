class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class MinD{
    public static int minDepth(Node root) {
        if (root == null)
            return 0;

        // If left is null, go right
        if (root.left == null)
            return 1 + minDepth(root.right);

        // If right is null, go left
        if (root.right == null)
            return 1 + minDepth(root.left);

        // If both exist
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);

        System.out.println(minDepth(root)); // Output: 3
    }
}
