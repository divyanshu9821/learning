import java.util.Scanner;

public class throwExplicit {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            sc.close();
            throw new Exception("Age must be greater than 18");
        }
        System.out.println("+---------------------------------------+");
        System.out.println("|Welcome to the National voters' portal |");
        System.out.println("|\t    ---,---  ,,   ,  \t\t|");
        System.out.println("|\t       :     | \\  | \t\t|");
        System.out.println("|\t       :     |  \\ | \t\t|");
        System.out.println("|\t    ---'---  |   \\| \t\t|");

        System.out.println("+---------------------------------------+");

        sc.close();
    }
}
