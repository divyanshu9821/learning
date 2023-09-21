import java.util.Scanner;

class ascii{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("\nCharacter? ");
    char c = sc.next().charAt(0);
    int asciiValue = c;
    System.out.println("ASCII value of "+c+": "+asciiValue);
    System.out.println();
    sc.close();
    }
}