class Make {
    void sandwitch(String res1, String res2, String res3, String res4) {
        synchronized (res1) {
            System.out.println(Thread.currentThread().getName() + " has " + res1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + " needs other components");
            synchronized (res2) {
                System.out.println(Thread.currentThread().getName() + " has " + res2);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println(Thread.currentThread().getName() + " needs other components");

                synchronized (res3) {
                    System.out.println(Thread.currentThread().getName() + " has " + res3);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                    }
                    System.out.println(Thread.currentThread().getName() + " needs other components");

                    synchronized (res4) {
                        System.out.println(Thread.currentThread().getName() + " has " + res4);
                    }
                    System.out.println(Thread.currentThread().getName() + " has made his sandwitch\n");
                }
            }

        }
    }
}

public class Deadlock {
    public static void main(String[] args) {
        final String res1 = "breads";
        final String res2 = "veggie";
        final String res3 = "cheese";
        final String res4 = "ketchup";
        Make obj = new Make();
        Thread t1 = new Thread() {
            public void run() {
                obj.sandwitch(res1, res2, res3, res4);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                obj.sandwitch(res2, res1, res3, res4);
            }
        };
        Thread t3 = new Thread() {
            public void run() {
                obj.sandwitch(res3, res2, res1, res4);
            }
        };
        Thread t4 = new Thread() {
            public void run() {
                obj.sandwitch(res4, res2, res3, res1);
            }
        };

        t1.setName("Child1");
        t2.setName("Child2");
        t3.setName("Child3");
        t4.setName("Child4");

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {

        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {

        }
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {

        }
        t4.start();
        try {
            t4.join();
        } catch (InterruptedException e) {

        }
    }
}

/*
 * output:-
 * 
 * $ javac lab/Deadlock.java
 * $ java lab/Deadlock
 * 
 * Child1 has breads
 * Child1 needs other components
 * Child1 has veggie
 * Child1 needs other components
 * Child1 has cheese
 * Child1 needs other components
 * Child1 has ketchup
 * Child1 has made his sandwitch
 * 
 * Child2 has veggie
 * Child2 needs other components
 * Child2 has breads
 * Child2 needs other components
 * Child2 has cheese
 * Child2 needs other components
 * Child2 has ketchup
 * Child2 has made his sandwitch
 * 
 * Child3 has cheese
 * Child3 needs other components
 * Child3 has veggie
 * Child3 needs other components
 * Child3 has breads
 * Child3 needs other components
 * Child3 has ketchup
 * Child3 has made his sandwitch
 * 
 * Child4 has ketchup
 * Child4 needs other components
 * Child4 has veggie
 * Child4 needs other components
 * Child4 has cheese
 * Child4 needs other components
 * Child4 has breads
 * Child4 has made his sandwitch
 * 
 */
