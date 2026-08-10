public class _111_doublylinkedl {
    public class node{
        int data;
        node next;
        node prev;
        public node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;

    // add
    public void addfirst(int data){
        node newnode = new node(data);
        size++;
        if ( head == null){
            head = tail = newnode;
            return ;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }
    // print 
    public void print(){
        node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " >");
            temp = temp.next;
        }
        System.out.println("null");
        
    }
    // remove
   public int removefirst(){
    if (head == null){
        System.out.println("dll is emcptu");
        return Integer.MIN_VALUE;
    }
    if(size == 1){
        int val = head.data;
        head = tail = null;
        size--;
        return val;
    }
    int val = head.data;
    head =head.next;
    head.prev = null;
    size--;
    return val;
   }
   public void reverse(){
    node curr = head;
    node prev = null;
    node next;
    while(curr!= null){
        next  = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next;
    }
    head =  prev;

   }
    public static void main(String[] args) {
        _111_doublylinkedl dll = new _111_doublylinkedl();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.print();
        dll.reverse();
        dll.print();
        
    }
}
