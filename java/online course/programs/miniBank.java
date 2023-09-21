import java.util.Scanner;

class bankClass {
    private int account_number;
    private String name;
    private double balance;

    bankClass(int account_number, String name){
        this.account_number = account_number;
        this.name = name;
    }

    void deposite(int val) {
        balance += val;
        System.out.println("\nRs. "+ val + " is credited in your bank account");
    }

    void withdraw(int val) {
        if(balance<val) System.out.println("\nNot enough balance in account");
        else{
            balance-=val;
            System.out.println("\nRs. "+ val +" is debited from your bank account");
        }
    }

    void display() {
        System.out.println("\nAccount Number: " + account_number);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

}


class miniBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankClass bc = new bankClass(101, "Nick");
        bc.display();
        bc.deposite(1000);
        bc.withdraw(500);
        bc.display();

        System.out.println();
        sc.close();
    }
}