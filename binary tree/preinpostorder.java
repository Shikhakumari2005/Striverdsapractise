
class Node{
    int val;
    Node R;
    Node L;
    public Node(int val){
        this.val=val;
    }
}
public class preinpostorder{
    public  static void preorder(Node root){
        if(root ==null) return;
        System.out.print(root.val +"->");
        preorder(root.L);
        preorder(root.R);
    }
    public static  void inorder(Node root){
        if(root==null)  return;
        inorder(root.L);
        System.out.print(root.val+ "->");
        inorder(root.R);
    }
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.L);
        postorder(root.R);
        System.out.print(root.val+ "->");
    }

    public static void main(String[] args){
       Node root=new Node(2);
       Node a=new Node(3);
       Node b=new Node(5);
       root.L=a;
       root.R=b;
    //Node root=new Node(2);
       Node c=new Node(6);
       Node d=new Node(7);
       a.L=c;
       b.R=d;
       System.out.println("Preorder");
       preorder(root);
       System.out.println("Inoreder");
       inorder(root);
       System.out.println("Postorder");
       postorder(root);
    }
}
// class Node {
//     int val;
//     Node L, R;

//     public Node(int val) {
//         this.val = val;
//     }
// }

// public class preinpostorder {

//     public static void preorder(Node root) {
//         if (root == null) return;

//         System.out.print(root.val + " ");
//         preorder(root.L.val);
//         preorder(root.R.val);
//     }

//     public static void inorder(Node root) {
//         if (root == null) return;

//         inorder(root.L.val);
//         System.out.print(root.val + " ");
//         inorder(root.R);
//     }

    // public static void postorder(Node root) {
    //     if (root == null) return;

    //     postorder(root.L);
    //     postorder(root.R);
    //     System.out.print(root.val + " ");
    // }

    // public static void main(String[] args) {

    //     Node root = new Node(2);
    //     Node a = new Node(3);
    //     Node b = new Node(5);
    //     Node c = new Node(6);
    //     Node d = new Node(7);

    //     root.L = a;
    //     root.R = b;
    //     a.L = c;
    //     b.R = d;

//         System.out.println("Preorder:");
//         preorder(root);

//         System.out.println("\nInorder:");
//         inorder(root);

//         System.out.println("\nPostorder:");
//         postorder(root);
//     }
// }