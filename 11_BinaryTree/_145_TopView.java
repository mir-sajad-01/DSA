import java.util.*;
public class _145_TopView {
    public static class node{
        int data;
        node right;
        node left;
        node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    static class info{
        node node;
        int hd ;
        info(node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topview (node root){
        // level order
        Queue<info> q = new LinkedList<>();
        HashMap <Integer,node> map = new HashMap<>();
        int min = 0 , max = 0 ;
        q.add(new info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left != null){
                    q.add(new info(curr.node.left , curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new info(curr.node.right, curr.hd+1));
                    max = Math.max(max , curr.hd+1);
                }
            }
        }
        for(int i = min ; i<=max ;i++){
            System.out.print(map.get(i).data +" ");
        }
    }
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right = new node(3);
        root.right.left = new node(6);
        root.right.right = new node(7);
        topview(root);
    }
}
