interface BankAccount{
    void deposite(int amount);
    void withdraw(int amount);
}

class checkingAccount implements BankAccount {

    public void deposite(int de){
        System.out.println("Amount deposited "+de);
    }    
    
    public void withdraw(int wi){
        System.out.println("You withdrew "+wi+" Rs.");
    }
}
class interfaceProg{
    public static void main(String[] args){
        checkingAccount ca = new checkingAccount();
        ca.deposite(10);
        ca.withdraw(100);
    }
}
