//implementation of queue using array
public class queueArray{
    static class queue{
        int arr[];
        int size;
        int rear =-1;
        
        queue(int size){
            this.arr = new int[size];
            this.size = size;
        }

        public boolean queueIsEmpty(){
            return rear==-1;
        }

        //enqueue
        public void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        //dequeue
        public int remove(){
            if(queueIsEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0;i < rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public int peek(){
            if(queueIsEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args){
        // queue q1 = new queue(5);
        // q1.add(1);
        // q1.add(4);
        // q1.add(10);
        // q1.add(5);
        // q1.remove();
        // while(!q1.queueIsEmpty()){
        //     System.out.println(q1.remove());
        // }
        // System.out.println(q1.peek());
    }
}