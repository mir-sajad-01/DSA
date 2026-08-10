import java.util.*;

public class practice{
    static class node{
        int data;
        node left;
        node right;
        public node(int data){
            this.data = data;
          
        }
    }
    public static node bst (node root , int val){
        if(root == null){
             root = new node(val);
             return root;
        } 
        if(root.data<val){
            root.right = bst(root.right , val);
        }else{
            root.left = bst(root.left , val);
        }
        return root;
    }
    public static void Inorder(node root){
        if(root == null){
            return ;
        }
        Inorder(root.left);
        System.out.print(root.data+ " ");
        Inorder(root.right);
    }
    public static boolean searchnum(node root , int val){
        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        }
        if(root.data < val){
            return searchnum(root.right,val);
        }else{
            return searchnum(root.left,val);
        }
    }

    public static node delete(node root , int val){
        if(root.data< val){
            root.right = delete (root.right , val);
        }else if( root.data> val){
            root.left = delete (root.left , val);
        }else{
            // leaf node;
            if(root.left == null && root.right == null){
                return null;
            }
            // single child
            if(root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }
            // both childeren ;
            node is =  findInorderSuccessor(root.right);
            root.data = is.data;
            root.right = delete (root.right , is.data);
        }
        return root;
    }
    public static node findInorderSuccessor(node root ){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }


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
    public static void printinrange(node root , int k1 , int k2){
        if(root == null){
            return ;
        }
        if(root.data>= k1 && root.data<= k2){
            printinrange(root.left,k1,k2);
            System.out.println(root.data + " ");
            printinrange(root.right,k1,k2);
        }
        else if(root.data<k1){
            printinrange(root.right , k1, k2);
        }else{
            printinrange(root.left,k1,k2);
        }
    }
    public static void printpath(ArrayList <Integer> ar){
        for(int i = 0 ;i < ar.size();i++){
            System.out.println(ar.get(i)+ " ");
        }
    }
    public static void roottoleaf(node root , ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);
        }
        roottoleaf(root.left, path);
        roottoleaf(root.right , path);

    }
    public static boolean isvalidbst(node root, node min , node max){
        if(root == null){
            return true;
        }
        if(min!= null && root.data<= min.data){
           return false;
        }
        if(max!= null && root.data >= max.data){
            return false;
        }
        return isvalidbst(root.left, min , root) && isvalidbst(root.right , root,max);
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        node root = null;
        for(int i = 0 ;i< values.length ;i++){
            root = bst(root, values[i]);
        }
        // Inorder(root);
        // System.out.println();
        // levelorder(root);
        roottoleaf(root, new ArrayList<>())
    }
}