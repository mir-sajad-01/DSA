public class _141_CountOfNodes {
    public static class node {
        int data;
        node right;
        node left;

        public node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int count(node root) {
        if (root == null) {
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount + rightcount + 1;
    }
    public static int sum(node root){
        if(root == null){
            return 0;
        }
        int leftsum= sum(root.left);
        int rightsum = sum(root.right);
        return leftsum + rightsum + root.data;
    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
      //  System.out.println(count(root));
      System.out.println(sum(root));

    }
}
