import java.util.Scanner;

public class andOperator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter Attendence:\t");
    double attendence = sc.nextDouble();
    System.out.print("Enter MCQs marks:\t");
    double mcqs = sc.nextDouble();
    System.out.print("Enter lab marks:\t");
    double lab = sc.nextDouble();
    System.out.println("____________________________________________");
    if (attendence > 70 && mcqs > 50 && lab > 70)
      System.out.println("\nCongrats! You are eligible for placements.");
    else
      System.out.println("\nYou are NOT eligible for placements.");
    System.out.println("____________________________________________");

    sc.close();
  }
}
