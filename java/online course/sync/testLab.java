package lab;
class Account{
	//initial account balance
	int accBalance = 50000;
	
	//synchronized withdraw method
	synchronized void withdraw(int amount)
	{
		System.out.println("Start withdrawing..");
		if(this.accBalance<amount)
		{
			System.out.println("Insufficient Balance!!");
			try {
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
		this.accBalance = accBalance-amount;
		System.out.println("Rs.(₹) "+amount+" has been withdrawn succesfully.");
	}
	
	
	//synchronized deposit method
	synchronized void deposit(int amount)
	{
		System.out.println("Depositing amount...");
		this.accBalance = accBalance + amount;
		System.out.println("Rs.(₹) "+amount+" has been deposited succesfully.");
		notifyAll();
	}
	
	//synchronized display balance method
	synchronized void display()
	{
		System.out.println("Displaying balance...");
		try {
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Balance: Rs. "+this.accBalance);
	}
	
}

class test{

	public static void main(String[] args) {
		Account acc = new Account(); //declaring object for the class Account
		
		
		//annonymous class
		new Thread()
		{
			public void run()
			{
				Thread.currentThread().setPriority(MIN_PRIORITY);
				System.out.println("Priority: "+Thread.currentThread().getPriority());
				acc.withdraw(60000); //we are trying to withdraw ₹60000 from the account
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				Thread.currentThread().setPriority(MAX_PRIORITY);
				System.out.println("Priority: "+Thread.currentThread().getPriority());
				acc.display(); //we are displaying the acc balance
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				// Thread.currentThread().setPriority(MAX_PRIORITY);
				System.out.println("Priority: "+Thread.currentThread().getPriority());
				acc.deposit(20000); //we are depositing ₹20000 to the acc balance
			}
		}.start();
		

	}

}
