public class _95_rotaesortedarray {
    public static int sorted(int arr[],int si , int ei , int tar){
        if ( si>ei){
            return -1;
        }
        int mid = si + ( ei-si)/2;
        if ( arr[mid]== tar){
            return mid ;
        }
        // for l1
        if ( arr[si] <= arr[mid] ){
           if (arr[si]<= tar && tar <= arr[mid]){
            return sorted (arr, si, mid -1, tar);
           }
           else{
            return sorted ( arr, mid +1, ei , tar);
           }
        }
        else{
            if ( arr[mid ]<= tar && tar<= arr[ei]){
                return sorted ( arr, mid +1, ei , tar);
            }
            else{
                return sorted ( arr, si, mid-1 , tar);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= { 4,5,6,7,0,2};
        System.out.println(sorted(arr,0,arr.length-1,0));
    }
}
