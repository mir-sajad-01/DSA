public class _150_TrsfrmToSumTree {
    public static class node{
        int data;
        node right ;
        node left ;
        node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static int sumtree(node root){
       if ( root == null){
        return 0;
       }
       int leftchild = sumtree(root.left);
       int rightchild = sumtree(root.right);
       int newleft = root.left== null ? 0 : root.left.data;
       int newright = root.right == null ? 0 : root.right.data;
       int data = root.data;
       root.data = leftchild + newleft + rightchild + newright;
       return data;
    }
    public static void preorder(node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        sumtree(root);
        preorder(root);
    }
}
