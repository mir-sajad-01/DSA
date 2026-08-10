import java.util.*;
public class _159_bstToBalncdBst {

    /*
     * 
     * public static class node {
     * int data;
     * node left, right;
     * 
     * node(int data) {
     * this.data = data;
     * this.left = this.right = null;
     * }
     * }
     * 
     * public static void inorder(node root, int arr[], int i[]) {
     * if (root == null) {
     * return;
     * }
     * inorder(root.left, arr, i);
     * arr[i[0]] = root.data;
     * i[0]++;
     * inorder(root.right, arr, i);
     * 
     * }
     * 
     * public static void preorder(node root) {
     * if (root == null) {
     * return;
     * }
     * System.out.print(root.data + " ");
     * preorder(root.left);
     * preorder(root.right);
     * }
     * 
     * public static node createBst(int arr[], int st, int end) {
     * if (st > end) {
     * return null;
     * }
     * int mid = (st + end) / 2;
     * node root = new node(arr[mid]);
     * root.left = createBst(arr, st, mid - 1);
     * root.right = createBst(arr, mid + 1, end);
     * return root;
     * }
     * 
     * public static void main(String[] args) {
     * node root = new node(8);
     * root.left = new node(6);
     * root.left.left = new node(5);
     * root.left.left.left = new node(3);
     * root.right = new node(10);
     * root.right.right = new node(11);
     * root.right.right.right = new node(12);
     * int arr[] = new int[100];
     * int i[] = { 0 };
     * inorder(root, arr, i);
     * root = createBst(arr, 0, i[0] - 1);
     * preorder(root);
     * 
     * }
     * 
     */
  
            public static class node {
                int data;
                node left, right;

                node(int data) {
                    this.data = data;
                    this.left = this.right = null;
                }
            }

            public static void getinorder(node root, ArrayList<Integer> inorder) {
                if (root == null) {
                    return;
                }
                getinorder(root.left,inorder);
                inorder.add(root.data);
                getinorder(root.right,inorder);

            }

            public static void preorder(node root) {
                if (root == null) {
                    return;
                }
                System.out.print(root.data + " ");
                preorder(root.left);
                preorder(root.right);
            }
           public static node createBst(ArrayList<Integer>inorder , int st, int end){
            if(st>end){
                return null;
            }
            int mid = (st+end)/2;
            node root = new node (inorder.get(mid));
            root.left = createBst(inorder,st,mid-1);
            root.right = createBst(inorder,mid+1,end);
            return root;
           }
            public static node balanceBst(node root){
                // inorder seq
                ArrayList<Integer> inorder = new ArrayList<>();
                getinorder(root,inorder);
                // sorted inorder -> balanced BSt
               root =  createBst(inorder,0,inorder.size()-1);
               return root;
            }

            public static void main(String[] args) {
                node root = new node(8);
                root.left = new node(6);
                root.left.left = new node(5);
                root.left.left.left = new node(3);
                root.right = new node(10);
                root.right.right = new node(11);
                root.right.right.right = new node(12);
               root = balanceBst(root);
               preorder(root);
            }
        }

    

