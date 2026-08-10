public class _146_KthLevel {
    // recursive approapch;
    /*
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
        public static void klevel(node root, int k ,int i){
            if(root == null){
                return;
            }
            if(k ==i ){
                System.out.print(root.data + " ");
            }
            klevel(root.left , k , i+1);
            klevel(root.right, k,i+1);
        }
    
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        klevel(root,3,1);
    }
     */
    // iterative approach

    /*
       public static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void level(node root, int k) {
        if(root == null){
            return;
        }
        
        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 1;
        while (!q.isEmpty()) {
            node curr = q.remove();
            if (curr == null) {
                
                if (q.isEmpty()) {
                    break;
                } else {

                    q.add(null);
                    level++;
                }
            } else {

                if (level == k) {
                    System.out.print(curr.data + " ");
                }

                if (curr.left != null) {
                    
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
     */
   
}
