import java.util.Arrays;
import java.util.Scanner;

class checkAnagram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("String1? ");
    String str1 = sc.next();
    char[] s1 = str1.toCharArray();

    System.out.println("String2? ");
    String str2 = sc.next();
    char[] s2 = str2.toCharArray();

    Arrays.sort(s1);
    Arrays.sort(s2);
    
    str1 = "";
    str2 = "";
    
    for(int i = 0;i<s1.length;i++) str1+=s1[i];   

    for(int i = 0;i<s2.length;i++) str2+=s2[i];


    if(str1.equals(str2)) System.out.println("Strings are anagram");
    else System.out.println("Strings are not anagram");
    sc.close();
    }
}