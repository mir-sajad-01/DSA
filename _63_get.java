public class _63_get {
        // Get ith bit 
        
        public static int trys(int n , int i ){
            int bitmask = 1<<i;
            if ((n & bitmask)== 0){
                return 0;
            }
            else{
                return 1;
            }
        }
          // Get ith bit 
          public static void main(String[] args) {
             int n  = 10;
             int i = 5;
             System.out.println(trys (n,i));
        }
        
        // Set ith bit
    
        /* public static int set(int n , int i ){
            int bitmask = 1<<i;
            return n| bitmask;
        }
        public static void main(String[] args) {
            int n = 001;
            int i = 2;
            System.out.println(set(n,i));
        }
        */
    
        // Clear Ith bit
        
        /* 
        public static int clear(int n , int i ){
            int bitmask = ~(1<<i);
            return n & bitmask;
        }
         
        public static void main(String[] args) {
            int n = 10;
            int i =  1;
            System.out.println(clear(n,i));
        }
        */
        // Update Ith bit

        /* 
        public static int updateithbit(int newbit, int i , int n){
            n = clear(n,i);
            int bitmask = newbit<<i;
            return n| bitmask ;
        }
    
        public static void main(String[] args) {
            int newbit=1;
            int i = 0; 
            int n = 10;
             System.out.println(updateithbit(newbit,i,n));
        }
        */

        // Clear last i bits

         /*public static int clearlastibits(int n , int i ){
            int bitmask = ~0<<i;
            return n & bitmask;
         }
        public static void main(String[] args) {
            System.out.println(clearlastibits(10,2));
        }
        */
       
        // Clear range of bits
       
         /*
         public static int rangeofbits(int n , int i , int j){
              int a = ~0<<j+1;
              int b = (1<<i) - 1;
              int bitmask = a|b;
              return n & bitmask;
         }
        public static void main(String[] args) {
           System.out.println(rangeofbits(10,2,4)); 
        }
        */

      
}
