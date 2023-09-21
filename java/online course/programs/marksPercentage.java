// 19-05-2023
// task: WAP to calculate percentage of student after taking 5 subjects marks from student

import java.util.Scanner;

class marksPercentage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter marks below (out of 100 in each subjects)");
        
        System.out.print("\n\nDiscrete Mathematics\t: ");
        int maths = sc.nextInt();
        System.out.print("C Language\t\t: ");
        int clang = sc.nextInt();
        System.out.print("Data Structure\t\t: ");
        int struct = sc.nextInt();
        System.out.print("Algorithm Design\t: ");
        int algo = sc.nextInt();
        System.out.print("Web Technologies\t: ");
        int web = sc.nextInt();

        //total marks
        float total = maths+clang+struct+algo+web;
        System.out.println("\nTotal\t\t: "+total);
        //percentage
        float percent = total/5;
        System.out.println("Percentage\t: "+percent);
        sc.close();

    }
    
}