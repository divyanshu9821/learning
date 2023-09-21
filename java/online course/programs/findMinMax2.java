import java.util.Scanner;

class findMinMax2 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter number of elements:");
    int noElements = sc.nextInt();
    if (noElements < 4) {
      System.out.println("\nShould have 4 elements atleast!");
      sc.close();

      return;
    }
    int max = -100000;
    int min = 100000;
    int max2 = -100000;
    int min2 = 100000;
    System.out.println("Enter " + noElements + " elements below:-");
    for (int i = 0; i < noElements; i++) {
      int num = sc.nextInt();
      if (num > max) {
        max2 = max;
        max = num;
      }

      if (num < min) {
        min2 = min;
        min = num;
      } else if (num < min2 && num != min)
        min2 = num;
    }
    System.out.println("Second Max Element: " + max2);
    System.out.println("Second Min Element: " + min2);
    sc.close();

  }
}
