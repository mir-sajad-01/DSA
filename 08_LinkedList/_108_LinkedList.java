
public class _108_LinkedList {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;
    public static int size;

    public void addfirst(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        if (head == null) {
            System.out.println(" ll is empty");
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addmiddle(int data, int indx) {
        if (indx == 0) {
            addfirst(data);
            return;
        }
        node newnode = new node(data);
        size++;
        node temp = head;
        int i = 0;
        while (i < indx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removefirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrsearch(int key) {
        node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void reverse() {
        node curr = tail = head;
        node next;
        node prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        /*
         * Initial State:
         * 
         * head points to the first node (1)
         * tail points to the last node (5)
         * Linked list: 1 -> 2 -> 3 -> 4 -> 5
         * Step 1:
         * 
         * curr = tail = head = 1
         * next = null
         * prev = null
         * Linked list: 1 -> 2 -> 3 -> 4 -> 5
         * Step 2:
         * 
         * next = curr.next = 2
         * curr.next = prev = null
         * prev = curr = 1
         * curr = next = 2
         * Linked list: 1 <- 2 -> 3 -> 4 -> 5
         * Step 3:
         * 
         * next = curr.next = 3
         * curr.next = prev = 1
         * prev = curr = 2
         * curr = next = 3
         * Linked list: 1 <- 2 <- 3 -> 4 -> 5
         * Step 4:
         * 
         * next = curr.next = 4
         * curr.next = prev = 2
         * prev = curr = 3
         * curr = next = 4
         * Linked list: 1 <- 2 <- 3 <- 4 -> 5
         * Step 5:
         * 
         * next = curr.next = 5
         * curr.next = prev = 3
         * prev = curr = 4
         * curr = next = 5
         * Linked list: 1 <- 2 <- 3 <- 4 <- 5
         * Step 6:
         * 
         * next = curr.next = null
         * curr.next = prev = 4
         * prev = curr = 5
         * curr = next = null
         * Linked list: 1 <- 2 <- 3 <- 4 <- 5
         * Final State:
         * 
         * head = prev = 5
         * tail = 1
         * Linked list: 5 -> 4 -> 3 -> 2 -> 1
         */

    }

    public int helper(node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if (indx == -1) {                            
            return -1;
        }
        return indx + 1;    
    }

    public int recsearch(int key) {
        return helper(head, key);
    }

    public void DeleteNthFromEnd(int n) {
        int sz = 0;
        node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        int i = 1;
        int itofind = sz - n;
        node prev = head;
        while (i < itofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public node findmid(node head) {
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkpalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 find mid
        node midnode = findmid(head);
        // step 2 reverse 2nd half
        node prev = null;
        node curr = midnode;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node right = prev;// right half head
        node left = head;
        // step 3 check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean iscycle() {
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // cycle exist
            }
        }
        return false; // cycle does not exist
    }

    public static void removecycle() {
        // detect cycle
        node slow = head;
        node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // find meeting point
        slow = head;
        node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle = last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {

        head = new node(1);
        node temp = new node(2);
        head.next = temp;
        head.next.next = new node(3);
        head.next.next.next = temp;
        System.out.println(iscycle());
        removecycle();
        System.out.println(iscycle());

    }
}