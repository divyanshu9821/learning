import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
            int n,num,rev = 0;
            System.out.print("Enter number: ");
            n = sc.nextInt();
            System.out.println();
            num = n;
            while(n>0){
                rev+= n%10;
                n/=10;
                rev*=10;
            }
            rev/=10;
            System.out.println("_________________________________");
            if(rev==num) System.out.println(num+" is a Palindrome");
            else System.out.println(num+" is not Palindrome");
            System.out.println("*********************************");
            sc.close();
    }
}
