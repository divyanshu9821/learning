// WAP for displaying greater no among two nos.
import java.util.Scanner;

class findGreater {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter num. 1 :");
    double num1 = sc.nextDouble();
    System.out.print("Enter num. 2 :");
    double num2 = sc.nextDouble();

    if (num1 > num2) {
      System.out.println(num1 + " is greater among " + num1 + " & " + num2);
    } else {
      System.out.println(num2 + " is greater among " + num1 + " & " + num2);
    }
        sc.close();

  }
}
