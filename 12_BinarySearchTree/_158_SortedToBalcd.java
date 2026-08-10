public class _158_SortedToBalcd {
   
        public static class node{
            int data;
            node left, right;
            node(int data){
                this.data = data;
                this.left = this.right = null;
            }
        }
  
        public static void preorder(node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static node createBst(int arr[], int st, int end){
            if(st>end){
                return null;
            }
            int mid = (st+end)/2;
            node root = new node(arr[mid]);
            root.left = createBst(arr,st,mid-1);
            root.right = createBst(arr,mid+1,end);
            return root;
        }
        public static void main(String[] args) {
            int arr[] = {3,5,6,8,10,11,12};
            node root = createBst(arr,0,arr.length -1);
            preorder(root);
        }
    }
    

