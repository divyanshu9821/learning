import java.util.Scanner;

class miniAtm {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double currentAccountBalance = 25000;
    while (true) {
      System.out.println("\033\143");
      double amountDesposited = 0;
      double amountWithdraw = 0;
      System.out.println("\t\tWelcome to our Banking system");
      System.out.println("Options:\n1. Check current balance\n2. Deposite amount\n3. Withdraw amount\n4. Exit");
      System.out.print("Enter choice: ");

      int choice = sc.nextInt();
      System.out.println();
      if (choice == 1) {
        System.out.println("CURRENT BALANCE: " + currentAccountBalance);
      } else if (choice == 2) {
        System.out.print("Enter Amount: ");
        amountDesposited = sc.nextDouble();
        currentAccountBalance += amountDesposited;
        System.out.println(amountDesposited + " successfully deposited in your account");
      } else if (choice == 3) {
        System.out.print("Enter Amount: ");
        amountWithdraw = sc.nextDouble();
        if (currentAccountBalance < amountWithdraw) {
          System.out.println("Error: Low Balance");
        } else {
          currentAccountBalance -= amountWithdraw;
          System.out.println("\n" +amountWithdraw + " successfully withdrew from account");
        }
      } else if (choice == 4) {
        break;
      } else {
        System.out.println("Error: Invalid choice");
      }

      System.out.print("\nDo you want to exit Y or N?");
      char exitFlag = sc.next().charAt(0);
      if (exitFlag == 'Y' || exitFlag == 'y')
        break;
      else if(exitFlag == 'N' || exitFlag == 'n') continue;
      else{
        System.out.println("Invalid\nExiting....");
      }  
      // double interest = (currentAccountBalance*0.02);
      // currentAccountBalance+=interest;
    }
    System.out.println("\033\143");
    System.out.println("!Amount reset");
    System.out.println("\n\nThankyou for choosing us.");
    sc.close();
  }
}
