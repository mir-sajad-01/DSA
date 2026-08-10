public class _86_lastoccu {
    public static int lastoccu(int arr[] , int key , int i ){
        if ( i== arr.length ){
            return -1;
        }
        int isfound = lastoccu(arr,key,i+1);
        if ( isfound ==-1 && arr[i]==key){
            return i ;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,5,4,5,7,8};
        System.out.println(lastoccu(arr,5,0));
    }
}
