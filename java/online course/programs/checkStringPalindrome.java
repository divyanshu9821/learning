import java.util.Scanner;
class checkStringPalindrome{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("\nString? ");
    String str = sc.next();
    int strLen = str.length();
    boolean isPalindrome = true;
    for(int i = 0;i<(strLen/2);i++){
        int st = i;
        int en = strLen - i -1;
        if(str.charAt(st)!=str.charAt(en)){
            isPalindrome = false;
            break; 
        }
    }
    System.out.print(str);
    if(isPalindrome) System.out.println(" is Palindrome");
    else System.out.println(" is not palindrome");
    System.out.println();
    sc.close();
    }
}