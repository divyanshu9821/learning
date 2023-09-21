// WAP for finding whether given no is Armstrong or not.

import java.util.Scanner;

class checkArmStrong {

  public static void main(String[] checkArmStrong) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number:");
    int num = sc.nextInt();
    int temp = num;
    int sumOfCubes = 0;

    while (temp > 0) {
      int cu = temp % 10;
      sumOfCubes += (cu * cu * cu);
      temp /= 10;
    }

    if (sumOfCubes == num) {
      System.out.println(num + " is ARMSTRONG number");
    } else {
      System.out.println(num + " is NOT ARMSTRONG number");
    }
    sc.close();
  }
}
