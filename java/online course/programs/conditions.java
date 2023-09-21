// 22-05-2023
// task: take percentage as input and print if the person is eligible for placement or not

import java.util.Scanner;

class conditions{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your percentage: ");
        float inputPercent = sc.nextFloat();
        if(inputPercent>100.00)
            System.out.println("Error!, Percentage must not exceed 100");
        else if(inputPercent>80.00) 
            System.out.println("Congrats!, You are eligible for placement\n");
        else 
            System.out.println("You are not eligible for placement\n");
        sc.close();
    }
}