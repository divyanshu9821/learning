

class SetGetPriority {
    void print(String s) {
        int i = 0;
        while (true) {
            if (i == 5)
                break;
            System.out.println(s);
            i++;
        }
        System.out.println(Thread.currentThread().getName() + " priority:" + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        final String good = "Good Morning";
        final String wel = "Welcome";

        SetGetPriority gw = new SetGetPriority();

        Thread t1 = new Thread() {
            public void run() {
                gw.print(good);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                gw.print(wel);
            }
        };

        t1.setPriority(3);
        t2.setPriority(8);

        t1.start();
        t2.start();
    }
}

/*
 * output:-
 * 
 * $ java lab/SetGetPriority.java
 * Welcome
 * Welcome
 * Welcome
 * Welcome
 * Welcome
 * Thread-1 priority:8
 * Good Morning
 * Good Morning
 * Good Morning
 * Good Morning
 * Good Morning
 * Thread-0 priority:3
 * 
 */