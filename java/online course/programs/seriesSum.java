// Write a program to find sum of the following series
// Sum = x-1/x+2/x-3/x….n/x

import java.util.Scanner;

class seriesSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Series: Sum = x - 1/x + 2/x - 3/x.......n/x\n");
    System.out.print("Enter x: ");
    double x = sc.nextInt();
    System.out.print("Enter n: ");
    double n = sc.nextInt();
    double sum = 0;
    for (int i = 1; i <= n; i++) {
      double ratio = i / x;
      if (i % 2 != 0) {
        ratio *= (-1);
      }
      sum += ratio;
    }
    sum += x;
    System.out.println("Series Sum: " + sum);
        sc.close();

  }
}
