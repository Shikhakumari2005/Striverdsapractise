class Node{
    int val;
    Node left;
    Node right;

    public Node(int val){
        this.val=val;
        // this.left=null;
        // this.right=null;
    }
}
class Sum {
    public static int  SumOfSUbtree(Node root){
        if(root==null){
            return 0;
        }
        int l=SumOfSUbtree(root.left);
        int r=SumOfSUbtree(root.right);
        int sum=root.val + l + r;
        return sum;
    }
    public static void main(String[] args){
        Node root =new Node(1);
        root.left =new Node(2);
        root.right =new Node(3);
        root.left.left =new Node(4);
        System.out.println("Sum of Tree = " + SumOfSUbtree(root));

    }
}
