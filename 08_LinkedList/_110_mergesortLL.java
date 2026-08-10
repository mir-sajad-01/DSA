public class _110_mergesortLL {
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

    public void addfirst(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    private node getmid(node head) {
        node slow = head;
        node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private node merge(node head1, node head2) {
        node mergedll = new node(-1);
        node temp = mergedll;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    public node mergesort(node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        node mid = getmid(head);
        // left & right ms
        node righthead = mid.next;
        mid.next = null;
        node newleft = mergesort(head);
        node newright = mergesort(righthead);
        // merge
        return merge(newleft, newright);

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

    public void zigzag() {
        // find mid
        node slow = head;
        node fast = head.next;
        while (fast != null & fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        node mid = slow;

        // reverse 2nd half
        node curr = mid.next;
        mid.next = null;
        node prev = null;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node left = head;
        node right = prev;
        node nextl, nextr;
        // alt merge - zig-zag merge
        while (left != null && right != null) {
            nextl = left.next;
            left.next = right;
            nextr = right.next;
            right.next = nextl;
            left = nextl;
            right = nextr;

        }
    }

    public static void main(String[] args) {
        _110_mergesortLL ll = new _110_mergesortLL();
        ll.addfirst(2);
        ll.addfirst(5);
        ll.addfirst(3);
        ll.addfirst(6);
        ll.addfirst(1);
        ll.addfirst(4);

        ll.print();
        head = ll.mergesort(head);
        ll.print();

    }
}
