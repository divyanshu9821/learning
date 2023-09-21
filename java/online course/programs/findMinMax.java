import java.util.Scanner;

class findMinMax {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter number of elements:");
    int noElements = sc.nextInt();
    int max = -100000;
    int min = 100000;
    int arr[] = new int[noElements];
    System.out.println("Enter " + noElements + " elements below:-");
    for (int i = 0; i < noElements; i++) {
      arr[i] = sc.nextInt();
      int num = arr[i];
      max = (num > max) ? num : max;
      min = (num < min) ? num : min;
    }
    System.out.println("Max Element: " + max);
    System.out.println("Min Element: " + min);
        sc.close();

  }
}
