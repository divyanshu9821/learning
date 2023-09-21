import java.util.Scanner;
class removeWhiteSpaces{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nString?[Enter below]:- ");
    String str = sc.nextLine();
    char[] charArr = str.toCharArray();
    str = "";
    for(int i = 0;i<charArr.length;i++){
        if(charArr[i]!=' ') str+=charArr[i];
    }
    System.out.println("\nString without whitespaces:-");
    System.out.println("---------------------------------");   
    System.out.println(str);
    System.out.println("---------------------------------");
    System.out.println();
    sc.close();
    }
}