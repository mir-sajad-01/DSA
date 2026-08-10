import java.util.*;
public class _147_lowestcomnAncestr {
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
    public static boolean getpath(node root , int n , ArrayList<node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundleft = getpath (root.left , n , path);
        boolean foundright = getpath(root.right , n, path);
        if(foundleft || foundright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static node lca(node root ,int n1 , int n2){
        ArrayList<node>path1 = new ArrayList<>();
        ArrayList<node>path2 = new ArrayList<>();
        getpath(root,n1,path1);
        getpath(root,n2,path2);
        // last common ancestor
        int i =  0;
        for(; i<path1.size()&& i<path2.size();i++){
            if(path1.get(i)!= path2.get(i)){
                break;
            }
        }
        // last equal node -> i- 1th;
        node lca = path1.get(i-1);
        return lca;
    }
    // approach 2 
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
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        System.out.println(lca2(root,4,5).data);
    }
}
