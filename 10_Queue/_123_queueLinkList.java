public class _123_queueLinkList {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class queue {
        public static node head = null;
        public static node tail = null;

        public static boolean isempty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            node newnode = new node(data);
            if (head == null) {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public int remove() {
            if (isempty()) {
                System.out.println("empty");
                return -1;
            }
            int front = head.data;
            // single element
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek() {
            if (isempty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!queue.isempty()) {
            System.out.println(queue.peek());
            q.remove();
        }
    }
}
