import java.util.Scanner;

class marksPercentage2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "\n######################Grade Calculator######################"
    );
    System.out.print("Enter number of subjects: ");
    int subjects = sc.nextInt();
    double totalMarks = 0;
    for (int i = 0; i < subjects; i++) {
      System.out.print("Enter Subject(" + (i + 1) + ") marks: ");
      double subMarks = sc.nextDouble();
      if (subMarks > 100) subMarks = 100;
      totalMarks += subMarks;
    }

    double percentage = totalMarks / subjects;
    System.out.println("\n*************Result*************");
    System.out.println("Marks obtained(" + subjects * 100 + "): " + totalMarks);
    System.out.println("Percentage obtained: " + percentage);
    if (percentage >= 90) System.out.print("Remarks: Excellent"); else if (
      percentage < 90 && percentage >= 75
    ) System.out.println("Remarks: Good"); else if (
      percentage < 75 && percentage >= 60
    ) System.out.println("Remarks: Pass"); else System.out.println(
      "Remarks: Fail"
    );
    System.out.println("********************************");
        sc.close();

  }
}
