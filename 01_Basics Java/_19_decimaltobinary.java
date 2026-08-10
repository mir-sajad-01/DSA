public class _19_decimaltobinary {
    // public static void dectobin(int num){
    //     int mynum = num;
    //     int pow = 0;
    //     int binary = 0;
        
    //     while ( num>0){
    //         int remainder = num % 2 ;
    //          binary = binary + remainder *(int) Math.pow(10,pow);
    //          num = num /2;
    //          pow++;
    //     }
    //     System.out.println("Binary num of " +mynum+" is " +binary);
    // }
    public static void dectobin(int num){
        int mynum = num;
        int pow = 0;
        int binary = 0;
        
        while ( num>0){
            int remainder = num % 2 ;
             binary = binary + remainder *(int) Math.pow(10,pow);
             num = num /2;
             pow++;
        }
        System.out.println("Binary num of " +mynum+" is " +binary);
    }
    public static void main(String[] args) {
        dectobin(101);
    }
}
