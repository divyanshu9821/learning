class GoodWelcome {
    void print(String s) {
        int i = 0;
        while (true) {
            if (i == 5)
                break;
            System.out.println(s);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            i++;
        }
        // System.out.println(Thread.currentThread().getName()+"
        // priority:"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        final String good = "Good Morning";
        final String wel = "Welcome";

        GoodWelcome gw = new GoodWelcome();

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

        // t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}

/*
 * output:-
 * 
 * $ java lab/GoodWelcomeSleep.java
 * Good Morning
 * Welcome
 * Welcome
 * Good Morning
 * Welcome
 * Good Morning
 * Welcome
 * Good Morning
 * Welcome
 * Good Morning
 * 
 */