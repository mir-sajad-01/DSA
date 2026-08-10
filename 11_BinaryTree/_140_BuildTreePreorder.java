public class _140_BuildTreePreorder{
    static class node{
        int data;
        node left;
        node right;
        public node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public  node buildTree(int nodes[]){
             idx++;
             if(nodes[idx]==-1){
                return null;
             }
             node newnode = new node(nodes[idx]);
             newnode.left = buildTree(nodes);
             newnode.right = buildTree(nodes);
             return newnode;
        }
    }
    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}