//implementation of circular queue using array
public class circularQueueArray {
    static class queue{
        int arr[];
        int size;
        int rear=-1;
        int front=-1;
        queue(int size){
            arr = new int[size];
            this.size = size;
        }

        public boolean queueIsEmpty(){
            return rear==-1 && front==-1 ;
        }

        public boolean queueIsFull(){
            return (rear+1)%size==front;
        }
        
        // enqueue
        public void add(int data){
            if(queueIsFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1)
                front = 0;

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        // dequeue
        public int remove(){
            if(queueIsEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int top = arr[front];
            if(rear==front){
                rear=front=-1;
            }
            else{
                front = (front+1)%size;
            }
            
            return top;
        }

        // peek
        public int peek(){
            if(queueIsEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        // queue q1 = new queue(5);
        // q1.add(1);
        // q1.add(2);
        // q1.add(3);
        // q1.add(4);
        // q1.add(5);
        // System.out.println(q1.remove());
        // q1.add(6);
        // System.out.println(q1.remove());
        // q1.add(7);
        // while(!q1.queueIsEmpty()){
        //     System.out.println(q1.remove());
        // }
    }
}
