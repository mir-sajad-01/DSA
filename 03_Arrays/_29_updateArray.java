
public class _29_updateArray {
    public static void update(int array[],int nonchng) {
        nonchng = 4;
        System.out.println("Updated the old value with 1 ");
        for ( int i = 0 ; i < array.length; i++){
           array[i] = array[i] + 1;
        }
    }
    public static void main(String[] args) {
        int arry[] = {1,2,3};
        int nonchng = 33;
        update(arry,nonchng);
        // changing the value of numbers due to the array as they are call by reference 
        for (int i = 0 ;i < arry.length ; i++){
            System.out.println(arry[i]);
        }
        // does not change the value as they are not array .
        System.out.println("non change number is " + nonchng );
    }
}
