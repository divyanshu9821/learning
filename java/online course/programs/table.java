import java.util.Scanner;
import java.util.Arrays;

class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name[] = { "Peter", "Amy", "John", "Boyd", "Cathy" };
        int value[] = { 15, 9, 14, 10, 12 };

        Arrays.sort(name);
        Arrays.sort(value);
        System.out.println("\nName\t\t\tValue");
        System.out.println();
        for (int i = 0; i < value.length; i++) {
            System.out.println(name[i] + "\t\t\t" + value[i]);
        }
        sc.close();
        System.out.println();
    }
}