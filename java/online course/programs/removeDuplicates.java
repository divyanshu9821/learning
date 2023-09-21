import java.util.Scanner;

public class removeDuplicates {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter array size :");
    int arrSize = sc.nextInt();
    int[] arr = new int[arrSize];
    System.out.println("Enter elements below :");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int count = -1;
    boolean dup = false;
    int unique[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          dup = true;
          break;
        }
      }
      if (!dup) {
        count++;
        unique[count] = arr[i];
      }
      dup = false;
    }
    System.out.println("\nArray with unique elements:");
    for (int i = 0; i <= count; i++) {
      System.out.println(unique[i]);
    }
        sc.close();

  }
}
