public class _122_Queue {
    // queue using array 

    /*  
        static class queue {
        static int arr[];
        static int size;
        static int rear;

        queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // add
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    */

    public static class queue{
        int arr[];
        int size;
        int rear;
        int front ;
        public queue(int n){
            arr= new int [n];
            size = n;
            rear = -1;
            front = -1;
        }
        public   boolean isempty(){
            return rear == -1 && front == -1;
        }
        public boolean isfull(){
            return (rear +1)%size == front;
        }
        public void add(int data){
            if(isfull()){
                System.out.println("full");
                return;
            }
            if(front == -1){
                front = 0;
            }            
            rear = (rear +1)%size;   
            arr[rear] = data;
        }
        public int remove(){
            if(isempty()){
                System.out.println("empty");
                return -1;
            }
             int result = arr[front];
             if(rear== front){
                rear = front = -1;          
             }else{
                front = (front +1)%size;
             }
             return result;
        }
        public int peek(){
            if(isempty()){
                System.out.println("emty");
                return -1;
            }
    
            return arr[front];
        }
       }
       public static void main(String[] args) {
        queue q = new queue(5);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        while(!q.isempty()){
            System.out.println(q.peek());
            q.remove();
        }
       }
}