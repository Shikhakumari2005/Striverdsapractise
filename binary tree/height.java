class Node{
    int val;
    Node r;
    Node l;

    public Node(int val){
        this.val=val;
        this.r=null;
        this.l=null;
    }
}

public class height {
    public static int Height(Node root){
        if(root==null){
            return 0;
        }else{
            return 1 +Math.max(root.r ,root.l);
        }

    }
    public static void main(String[] args) {
        Node root =new Node(1);
        Node a =new Node(2);
        Node b =new Node(3);
        Node c  =new Node(1);

    }
}
