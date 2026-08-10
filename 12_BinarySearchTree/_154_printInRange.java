public class _154_printInRange {
    public static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }
    public static node insert(node root, int val) {
        if (root == null) {
            root = new node(val);
            return root;
        }
        if (root.data < val) { 
            root.right = insert(root.right, val);
        } else {
           root.left = insert(root.left, val);
        }
        return root;
    }

    public static void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }
    public static void printinrange(node root , int k1 , int k2){
        if(root == null){
            return ;
        }
        if(root.data>= k1 && root.data<= k2){
            printinrange(root.left , k1 ,k2);
            System.out.print(root.data+" ");
            printinrange(root.right,k1,k2);
        }
        else if ( root.data<k1){
            printinrange(root.right,k1,k2);
        }else{
            printinrange(root.left,k1,k2);
        }
    }

    public static void main(String[] args) {
        int values[] = { 8,5,3,1,4,6,10,11,14 };
        node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        printinrange(root,5,12);
        
   
    }
}
