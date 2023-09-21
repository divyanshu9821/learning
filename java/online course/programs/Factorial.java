import java.util.Scanner;

class Factorial {

    public static int factorial(int num){
        if(num<2) return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("num: ");
        a = sc.nextInt();
        if (a < 1) {
            sc.close();
            throw new ArithmeticException("Factorial is calculated only for positive numbers");
        } else
            System.out.println(factorial(a));   

        sc.close();
    }
}