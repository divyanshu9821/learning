import java.util.Scanner;

class divideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Num1: "); 
            int a = sc.nextInt();
            System.out.print("Enter Num2: ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Not possible to divide a number by zero(0)");
        } finally {
            sc.close();
        }
    }
}
