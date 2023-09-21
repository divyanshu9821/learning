/*write a program to print given below pattern?

* * * * *

* * * *

* * *

* *

*

*/

import java.util.Scanner;

class reverseStarPattern {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.print("How many lines to print(Only whole numbers): ");
      int lines = sc.nextInt();
      System.out.println();
      for (int i = lines; i >= 1; i--) {
        for (int j = i; j >= 1; j--) {
          System.out.print("* ");
        }
        System.out.println();
      }
    } catch (Exception e) {}
        sc.close();

  }
}
