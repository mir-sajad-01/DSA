public class _96_practiceDvdndconq {
    public static void printarr(String str[]) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
    }
    public static void merging (String str [],int si, int ei){
         if ( si>=ei ){
            System.out.println(str);
            return ;
         }
         int mid = si + ( ei-si)/2;
         merging (str,si,mid);
         merging (str,mid+1,ei);
         mergi(str,si,ei,mid);
    }
    public static void mergi(String str[],int si,int ei,int mid){
          String temp[] = new String [ei-si+1];
          int i = si ;
          int j = mid +1;
          int k = 0 ;
          while ( i <= mid && j<=ei){
             if (str[i].compareTo(str[j])<0){
                temp[k] = str[i];
                i++;
             }else{
                temp[k] = str[j];
                j++;
             }
             k++;
          }
          while ( i <= mid){
            temp[k++] = str [i++];

          }
          while ( j <= ei){
            temp[k++] =str [j++];
          }
          for ( k = 0 , i = si ; k<temp.length ;k++,i++){
            str[i] = temp[k];
          }
    }
    public static void main(String[] args) {
        String str[] = {"sun","earth","mars","mercury"};
        merging ( str , 0, str.length-1);
        printarr(str);
    }
}
