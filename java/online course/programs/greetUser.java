// 18-05-2023
// task1 print 'hello <username>' in terminal

import java.util.Scanner;

class greetUser{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Welcome" + name);
        sc.close();
    }
}