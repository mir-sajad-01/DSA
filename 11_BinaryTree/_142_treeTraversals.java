import java.util.*;

public class _142_treeTraversals {
    static class node {
        int data;
        node left;
        node right;

        public node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        int idx = -1;

        public node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            node newnode = new node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);
            return newnode;
        }
    }

    // preorder
    /*
     * public static void preorder(node root){
     * if(root == null){
     * System.out.print(-1 +" ");
     * return;
     * }
     * System.out.print(root.data+" ");
     * preorder(root.left);
     * preorder(root.right);
     * }
     */
    // inorder
    /*
     * public static void inorder(node root){
     * if(root == null){
     * return;
     * }
     * inorder(root.left);
     * System.out.print(root.data+" ");
     * inorder(root.right);
     * }
     */
    // postorder
    /*
     * public static void postorder(node root){
     * if(root == null){
     * return ;
     * }
     * postorder(root.left);
     * postorder(root.right);
     * System.out.print(root.data+" ");
     * }
     */
    /*
     * public static void levelorder(node root) {
     * if (root == null) {
     * return;
     * }
     * Queue<node> q = new LinkedList<>();
     * q.add(root);
     * q.add(null);
     * while (!q.isEmpty()) {
     * node currnode = q.remove();
     * if (currnode == null) {
     * System.out.println();
     * if (q.isEmpty()) {
     * break;
     * } else {
     * q.add(null);
     * }
     * }else{
     * System.out.print(currnode.data+" ");
     * if(currnode.left!=null){
     * q.add(currnode.left);
     * }
     * if(currnode.right!=null){
     * q.add(currnode.right);
     * }
     * }
     * }
     */
    public static void levelorder(node root) {
        if (root == null) {
            return;
        }
        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            node currnode = q.remove();
            if (currnode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currnode.data + " ");
                if (currnode.left != null) {
                    q.add(currnode.left);
                }
                if (currnode.right != null) {
                    q.add(currnode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        node root = tree.buildTree(nodes);
        // preorder(root);
        // inorder(root);
        // postorder(root);
        levelorder(root);
    }
}
