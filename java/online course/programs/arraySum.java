import java.util.Scanner;

class arraySum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter size of Array: ");
    int arrSize = sc.nextInt();
    System.out.println("\nEnter " + arrSize + " elements below:-");
    int arr[] = new int[arrSize];
    for (int i = 0; i < arrSize; i++) {
      arr[i] = sc.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < arrSize; i++) {
      sum += arr[i];
    }
    System.out.print("\nSum of elements: ");
    System.out.print(sum);
    System.out.println();
        sc.close();

  }
}
