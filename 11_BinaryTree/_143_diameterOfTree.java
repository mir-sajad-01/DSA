public class _143_diameterOfTree {
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

    public static int height(node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int diameter(node root) {
        if (root == null) {
            return 0;
        }
        int leftdia = diameter(root.left);
        int leftht = height(root.left);
        int rightdia = diameter(root.right);
        int rightht = height(root.right);
        int selfdia = leftht + rightht + 1;
        return Math.max(selfdia, Math.max(leftdia, rightdia));
    }

    // optimize code tc = o(n)
    static class info {
        int diam;
        int ht;

        public info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static info diameters(node root) {
        if (root == null) {
            return new info(0, 0);
        }
        info leftinfo = diameters(root.left);
        info rightinfo = diameters(root.right);
        int diam = Math.max(Math.max(leftinfo.diam, rightinfo.diam), leftinfo.ht + rightinfo.ht);
        int ht = Math.max(leftinfo.ht, rightinfo.ht) + 1;
        return new info(diam, ht);
    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
       // System.out.println(diameter(root));
        System.out.println(diameters(root).diam);
    }
}
