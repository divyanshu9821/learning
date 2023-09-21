import java.util.Scanner;

class studentRecord2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Size of Class:");
    int sizeClass = sc.nextInt();
    String name[] = new String[sizeClass];
    String email[] = new String[sizeClass];
    long phone[] = new long[sizeClass];
    int marks[] = new int[sizeClass];

    for (int i = 0; i < sizeClass; i++) {
      System.out.println("Enter Student " + (i + 1) + " Details");
      System.out.print("Name: ");
      name[i] = sc.nextLine();
      System.out.print("email: ");
      email[i] = sc.nextLine();
      System.out.print("phone no.: ");
      phone[i] = sc.nextInt();
      System.out.print("marks: ");
      marks[i] = sc.nextInt();
      sc.nextLine();
    }

    System.out.println("\nStudent Records");
    for (int i = 0; i < sizeClass; i++) {
      System.out.println("Student " + (i + 1));
      System.out.println("Name: " + name[i]);
      System.out.println("Email: " + email[i]);
      System.out.println("Phone: " + phone[i]);
      System.out.println("Marks: " + marks[i]);
    }
        sc.close();

  }
}
