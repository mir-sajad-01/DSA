public class _18_binarytodecimal {
    public static void bintodec(int num){
        int mynum = num;
        int decimal = 0 ;
        int powr = 0;
        while ( num > 0){
            int lastdigit = num % 10;
            decimal = decimal + (lastdigit *(int) Math.pow(2,powr));
            powr ++;
            num = num /10;
        }
        System.out.println("decimal of "+mynum+" is "+ decimal);

    }
     public static void main(String[ ] args){
          bintodec(1010);
     }

}
