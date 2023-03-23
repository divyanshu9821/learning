public class queueLinkedList {
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    
    static class queue{

        static node head = null;
        static node tail = null;
        
        public boolean queueIsEmpty(){
            return head==null&&tail==null;
        }

        public void add(int data){
            node newNode = new node(data);
            if(tail==null){
                head=tail=newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;        
        }

        public int remove(){
            if(queueIsEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int top = head.data;
            
            if(head==tail){
                tail=null;
            }

            head = head.next;
            return top;
        }

        public int peek(){
            if(queueIsEmpty()){
                System.out.println("queue is empty");
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
        q.add(4);
        q.add(5);
        q.add(6);
        while(!q.queueIsEmpty()){
            System.out.println(q.remove());
        }
    }
}
