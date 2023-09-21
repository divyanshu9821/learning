import java.util.Scanner;

class charcaterCount{
    static int occurence(String s, char c){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==c) count++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nString? ");
        String word = sc.next();
        System.out.print("Character? ");
        char letter = sc.next().charAt(0);
        int occ = occurence(word, letter);
        System.out.println(letter+" occurs " + occ + " times");
        System.out.println();
        sc.close();
    }
}