package sync;

//shared object
class PrintData {
	void multiplication(int num) // method is not synchronized
	{
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(num + " * " + i + " =  " + num * i);

				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}

class Thread1 extends Thread {
	PrintData pd;

	public Thread1(PrintData pd) {
		this.pd = pd;
	}

	public void run() {
		pd.multiplication(3);
	}
}

class Thread2 extends Thread {
	PrintData pd;

	public Thread2(PrintData pd) {
		this.pd = pd;
	}

	public void run() {
		pd.multiplication(5);
	}
}

class ProblemWithoutSynchronization {

	public static void main(String[] args) {
		// only one object of PrintData class
		PrintData pd = new PrintData();
		PrintData pd1 = new PrintData();

		// two threads which are going to share the above object
		Thread1 t1 = new Thread1(pd);
		Thread2 t2 = new Thread2(pd1);

		t1.start();
		t2.start();

	}

}
