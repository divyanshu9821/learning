import java.util.ArrayList;

// stack implementation using array list
public class stackArrayList {

    static class stack {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean stackIsEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            int top = list.get(list.size() - 1);
            if (stackIsEmpty()) {
                return -9999;
            }
            list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            return list.get(list.size() - 1);

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
