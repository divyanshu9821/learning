class GoodWelcome {
    void print(String s) {
        int i = 0;
        while (true) {
            if (i == 5)
                break;
            System.out.println(s);
            i++;
        }
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

        t1.start();
        t2.start();
    }
}

/*
 * output:-
 * 
 * $ java lab/GoodWelcome
 * 
 * Good Morning
 * Good Morning
 * Welcome
 * Welcome
 * Welcome
 * Welcome
 * Welcome
 * Good Morning
 * Good Morning
 * Good Morning
 * 
 */