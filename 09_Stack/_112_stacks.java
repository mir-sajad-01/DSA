//import java.util.*;

// stack using array

// public class Solution {
//    public static class stack {
//       static int top;
//       static int size;
//       static int arr[];

//       stack(int n) {
//          size = n;
//          arr = new int[n];
//          top = -1;
//       }
//       public boolean isEmpty(){
//          return top == -1;
//       }
//       public void push(int data){
//          if(top == size-1){
//             System.out.println("Stack is full");
//             return ;
//          }
//          top++;
//          arr[top] = data;
//       }
//       public int pop(){
//          if(isEmpty()){
//             System.out.println("Empty stack");
//             return -1 ;
//          }
//          int result = arr[top];
//          top--;
//          return result ;
//       }
//       public int peek(){
//          return arr[top];
//       }
//       public void print(){
//          while(!isEmpty()){
//             System.out.println(peek());
//             pop();
//          }
//       }
//    }

//    public static void main(String[] args) {
//       stack s = new stack(5);
//       s.push(1);
//       s.push(2);
//       s.push(3);
//       s.push(4);
//       s.print();
//    }
// }
// stacks using arraylist
/*
  public class _112_stacks {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isempty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (isempty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        // stack s = new stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isempty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
*/

// stacks using linkedlist

public class _112_stacks {
    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stack {
        static node head = null;

        public static boolean isempty() {
            return head == null;
        }

        // push
        public static void push(int data) {
            node newnode = new node(data);
            if (isempty()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        // pop
        public static int pop() {
            if (isempty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek() {
            if (isempty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isempty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}