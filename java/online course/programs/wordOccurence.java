import java.util.Scanner;
class wordOccurence{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("String? ");
    String str = sc.nextLine();
    String strArr[] = str.split(" ");
    System.out.println("Word? ");
    String word = sc.next();
    sc.nextLine();
    int count = 0;
    for(int i = 0;i<strArr.length;i++){
        if(strArr[i].equals(word)){
            
            count++;
        }
    }
    System.out.println(word + " is occured "+count+" times" );
    sc.close();
    }
}