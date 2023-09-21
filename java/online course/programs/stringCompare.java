import java.util.Scanner;

class stringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter another string: ");
        String s2 = sc.nextLine();
        System.out.println();
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }
        System.out.println();
        sc.close();
    }
}