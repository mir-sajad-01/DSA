public class _157_mirrorBst {
    public static class node{
        int data;
        node left, right;
        node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static node mirrorbst(node root){
        if(root == null){
            return null;
        }
        node leftmirror = mirrorbst(root.left);
        node rightmirror = mirrorbst(root.right);
        root.left = rightmirror;
        root.right = leftmirror;
        return root;
    }
    public static void preorder(node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        node root = new node(8);
        root.left = new node(5);
        root.left.left = new node(3);
        root.left.right = new node(6);
        root.right = new node( 10);
        root.right.right = new node(11);
        root =  mirrorbst(root);
        preorder(root);
    }
}
