// if there is exception the program is terminated and print the message explicity given to the expection handling statement;

import java.util.Scanner;

class throwKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("num1: ");
        a = sc.nextInt();
        System.out.print("num2: ");
        b = sc.nextInt();

        if (b < 1) {
            sc.close();
            throw new ArithmeticException("divisor must be greater than 0");
        } else
            System.out.println("num1/num2: " + a / b);

        
        System.out.println("if there is exception it wont execute.");
   

        sc.close();
    }
}