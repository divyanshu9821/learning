import java.util.Scanner;

public class miniCalc {
    public static void main(String[] args){
        char loop ='n';
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\033\143");
            System.out.print("***********************");
            System.out.print("MINI CALC");
            System.out.println("***********************\n");
            System.out.println("Performs basic arithmetic between two numbers\n");
            System.out.println("\t\tChoices:\n\n1. Addition\n2. Subtract\n3. Mutliplication\n4. Division\n");

            System.out.print("Choice(1/2/3/4)? ");
            int choice = sc.nextInt();
            
            int num1,num2;
            System.out.print("\nEnter Num1:"); num1 = sc.nextInt();
            System.out.print("Enter Num2:"); num2 = sc.nextInt();

            int ans = 0;
            switch(choice){
                case 1: ans = num1+num2;
                break;
                case 2: ans = num1-num2;
                break;
                case 3: ans = num1*num2;
                break;
                case 4: ans = num1/num2;
                break;
                default: System.out.println("Invalid choice");
                break;
            }
            
            System.out.println("\nOutput: "+ans);
            System.out.print("\nWanna continue: Y or N? ");
            loop = sc.next().charAt(0);
        }while(loop=='y' || loop=='Y' );
        System.out.println("********************************************************");
        sc.close();
    }
}
