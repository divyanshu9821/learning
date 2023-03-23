public class linkedList {
    private int size = 0;
    
    class node {
        String data;
        node next;
    
        node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    
    node head = null;

    // insert at first position
    public void addFirst(String data) {
        node newNode = new node(data);
        size++;
        // if (head == null) {
        // head = newNode;
        // return;
        // }

        newNode.next = head;
        head = newNode;
    }

    // insert at last position
    public void addLast(String data) {
        node newNode = new node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // insert at some location in between
    public void addBet(String data, int index) {
        if (index > size || index < 0) {
            System.out.println("Invalid index");
            return;
        }
        size++;
        node newNode = new node(data);
        if (head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        node currNode = head;
        for (int i = 1; i < size; i++) {
            if (i == index) {
                newNode.next = currNode.next;
                currNode.next = newNode;
                break;
            }
            currNode = currNode.next;
        }

    }

    // remove from first position
    public void removeFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // remove from last position
    public void removeLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;

        if (head.next == null) {
            head = null;
            return;
        }
        node prevNode = head;
        node currNode = head.next;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;
    }

    // print linkedList
    public void print() {
        if (head == null) {
            System.out.println("empty");
        }
        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
            currNode = currNode.next;
        }
    }

    // get size
    public void getSize() {
        System.out.println(size);
    }

    // reverse linkedlist iterative
    public void reverseIterative() {

        node prevNode = head;
        node currNode = head.next;
        while (currNode != null) {
            node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    //reverse linked list with recursion
    public node reverseRecursive(node head){
        if(head==null||head.next==null)
            return head;
            
        node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addFirst("is ");
        list.addFirst("this ");
        list.addLast("a ");
        list.addLast("linkedList ");
        // list.removeFirst();
        // list.removeFirst();
        // list.removeLast();
        // list.removeLast();
        // list.addBet("between ", 2);
        // list.addBet("between ", 4);
        // list.print();
        // list.reverseIterative();
        list.print();
        System.out.println();
        list.getSize();

    }
}
