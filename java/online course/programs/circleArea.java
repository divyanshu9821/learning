import java.util.Scanner;

public class circleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char loop = 'n';
        do{
            System.out.println("\033\143");
            System.out.println("**************FIND AREA OF CIRCLE**************");
            System.out.print("\nEnter radius: ");
            double radius = sc.nextDouble();
            double area = radius*radius*22/7;
            System.out.println("Area: "+area);
            System.out.print("\nWant to find another circle's area. Y or N? ");
            loop = sc.next().charAt(0);
        }while(loop=='Y'||loop=='y');
        sc.close();
    }
}