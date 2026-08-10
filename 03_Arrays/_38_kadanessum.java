
public class _38_kadanessum {
    public static void kadanessum(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0 ; i<numbers.length ; i++){
            cs = cs + numbers[i];
            if (cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
          
        }
        System.out.println("our max subarray sum is " + ms);
    }
    public static void main(String[] args) {
        int numbers[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        kadanessum(numbers);
    }
}

//   public int maxSubArray(int[] nums) {

//         int cs = nums[0];
//         int max = nums[0];

//         for (int i = 1; i < nums.length; i++) {

//             cs = Math.max(nums[i], cs + nums[i]);

//             max = Math.max(max, cs);
//         }

//         return max;
//     }
