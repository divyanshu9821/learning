import java.util.Scanner;
class printDuplicates{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nInput String below:-");
    String str = sc.next();
    char[] charArr = str.toCharArray();
    System.out.print("\nDuplicates:");
    for(int i = 0;i<charArr.length;i++){
        for(int j = i+1;j<charArr.length;j++){
            if(charArr[i]==charArr[j]){
                System.out.print(" "+charArr[i]);
                break;
            }
        }
    }
    System.out.println();
    sc.close();
    }
}