import java.util.Scanner;

class reverseWords{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("\nString? ");
    String str = sc.nextLine();
    String[] words = str.split(" ");
    str = "";
    for(int i = 0;i<words.length;i++){
        StringBuilder sb = new StringBuilder(words[i]);
        sb.reverse();
        str+=sb+" ";
    }
    System.out.println(str);
    System.out.println();
    sc.close();
    }
}