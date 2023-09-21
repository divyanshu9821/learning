import java.util.Scanner;

class numberFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String countryCode = sc.next();
        int code = 0;
        try {
            code = Integer.parseInt(countryCode);

        } catch (NumberFormatException e) {
            System.out.println("+-----------------------------------------------+");
            System.out.println("|Not able to convert String to Interger\t\t|");
            System.out.println("|other than numeric characters present in \'" + countryCode+"\'\t|");
            System.out.println("+-----------------------------------------------+");

        } finally {
            sc.close();
            System.out.println(code);
        }
    }
}