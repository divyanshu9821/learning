import java.util.Scanner;

public class studentRecord {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of students: ");
    int students = sc.nextInt();

    String[] names = new String[students];
    double[] percentage = new double[students];

    for (int i = 0; i < students; i++) {
      System.out.println("\n-- Entry " + (i + 1) + " --");
      System.out.print("Name: ");
      names[i] = sc.next();
      System.out.print("Percentage: ");
      percentage[i] = sc.nextDouble();
    }

    System.out.println("\n\nList of students who get more than 50%\n");
    for (int i = 0; i < students; i++) {
      if (percentage[i] > 50) {
        System.out.println(names[i] + " : " + percentage[i]);
      }
    }
        sc.close();

  }
}
