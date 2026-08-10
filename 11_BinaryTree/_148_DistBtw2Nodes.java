public class _148_DistBtw2Nodes {
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
    public static node lca2(node root , int n1 , int n2){
        if(root== null|| root.data== n1 || root.data == n2){
            return root;
        }
        node leftlca = lca2(root.left , n1 , n2);
        node rightlca = lca2(root.right , n1 , n2);
        if(leftlca == null){
            return rightlca;
        }
        if(rightlca == null){
            return leftlca;
        }
        return root;
    }
    public static int lcadist(node root , int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftdis = lcadist(root.left, n);
        int rightdis = lcadist(root.right,n);
        if(leftdis== -1 && rightdis==-1){
            return -1;
        }else if (leftdis== -1){
            return rightdis + 1;
        }else{
            return leftdis +1;
        }

    }
    public static int middist(node root , int n1, int n2){
         node lca = lca2(root,n1,n2);
         int dist1 = lcadist(lca , n1);
         int dist2 = lcadist(lca,n2);
         return dist1 + dist2;
    }
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        System.out.println(middist(root,5,6));
    }
}
