
public class _37_subarraysumPrefix {
    public static void prefixsum(int numbers[]){
        int currsum  = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length];
        prefix[0] = numbers[0];
        for ( int i = 1 ; i<prefix.length ; i++){
             prefix[i] = prefix [i-1] + numbers[i];
             System.out.print(prefix[i]+" ");
        }
        System.out.println();
        for ( int i = 0 ; i<numbers.length ; i++){
            int start = i;
            for ( int j = i ; j<numbers.length ; j++){
                int end = j ;
                currsum = start==0?prefix[end]:prefix[end]-prefix[start-1];
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.print("max sum is "+ maxsum);
    }
    public static void main(String[] args) {
        int numbers[] = {3,4,5,6,8,9};
        prefixsum(numbers);
    }
}
