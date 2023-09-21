import java.util.Scanner;
class lastFour{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter string: ");
    String str = sc.next();
    if(str.length()<4){
        System.out.println("String must contain atlease four characters!");
        sc.close();
        return;
    }
    char charArr[] = str.toCharArray();
    int n = charArr.length;
    for(int i = 0;i<n;i++){
        if(i<n-4)
            charArr[i]='X';
    }
    str=new String(charArr);
    System.out.print("Hidden character string: ");
    System.out.println(str);
    System.out.println();
    sc.close();
    }
}