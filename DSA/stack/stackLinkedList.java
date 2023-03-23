//stack implmentation using linkedlist
public class stackLinkedList {

    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class stack {

        static node head;

        public boolean stackIsEmpty() {
            return head == null;
        }

        public void push(int data) {
            node newNode = new node(data);
            if (stackIsEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (stackIsEmpty()) {
                System.out.print("Empty stack ");
                return -9999;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (stackIsEmpty()) {
                System.out.print("Empty stack ");
                return -9999;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        stack s1 = new stack();
        s1.push(5);
        s1.push(2);
        s1.push(1);
        s1.push(4);
        s1.push(7);
        while(!s1.stackIsEmpty()){
            System.out.println(s1.pop());
        }
    }

}