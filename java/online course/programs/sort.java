import java.util.Scanner;

class sort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter Size of array: ");
    int size_of_array = sc.nextInt();
    int numeric_array[] = new int[size_of_array];

    System.out.println("Enter " + size_of_array + " elements below:- ");

    int max_element_in_array = -100000000;
    // taking input in array and finding the maximum element among them
    for (int i = 0; i < size_of_array; i++) {
      numeric_array[i] = sc.nextInt();
      if (numeric_array[i] < 0) {
        System.out.println("Enter only positive values!");
        sc.close();
        return;
      }
      if (max_element_in_array < numeric_array[i]) {
        max_element_in_array = numeric_array[i];
      }
    }

    int count_array[] = new int[max_element_in_array + 1];
    // populate count_array
    for (int i = 0; i < size_of_array; i++) {
      count_array[numeric_array[i]] = 1;
    }

    System.out.print("\nUnique & sorted elements: ");

    for (int i = 0; i <= max_element_in_array; i++) {
      if (count_array[i] > 0) System.out.print(" " + i);
    }

    System.out.println();
    sc.close();

  }
}
