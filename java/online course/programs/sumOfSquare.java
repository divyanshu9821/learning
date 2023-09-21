// WAP for finding the sum of the square of all the digits of given no.

import java.util.Scanner;

class sumOfSquare {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.print("How many times? ");
      int testCases = sc.nextInt();

      do {
        System.out.print("\nEnter number: ");
        int num = sc.nextInt();
        int temp = num;

        int ans = 0;

        while (temp > 0) {
          ans += ((temp % 10) * (temp % 10));
          temp /= 10;
        }

        System.out.println("Sum Of Sqaures of Digits(" + num + ") : " + ans);

        testCases--;
      } while (testCases > 0);
    } catch (Exception e) {}
        sc.close();

  }
}
